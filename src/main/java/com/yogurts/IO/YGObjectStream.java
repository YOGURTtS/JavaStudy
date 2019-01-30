package com.yogurts.IO;

import java.io.*;

public class YGObjectStream {

    public static void main(String[] args) {


        ObjectOutputStream outputStream = null;
        ObjectInputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            outputStream = new ObjectOutputStream(new BufferedOutputStream(byteArrayOutputStream));
            Person sunxing = new Person("孙星", 18);
            outputStream.writeObject(sunxing);
            outputStream.flush();
            byte[] datas = byteArrayOutputStream.toByteArray();
            inputStream = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
            Person person = (Person) inputStream.readObject();
            System.out.println(person.age);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }
}

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}