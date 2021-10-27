package ro.uvt.sablab3;

import java.util.concurrent.TimeUnit;

public class ImageProxy implements Element{
    private String name;

    public ImageProxy(String imageName) {
        this.name = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int index) {
        return null;
    }
}
