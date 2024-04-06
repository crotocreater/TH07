package Utils;

import control.controlData;

import java.io.*;

public class FileIO implements Serializable {
    private String key ;

    public FileIO(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public void fileI(controlData a){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(key))){
            objectOutputStream.writeObject(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public controlData fileO(){
        controlData a = new controlData();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(key))){
            a =(controlData) objectInputStream.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return a;
    }
}
