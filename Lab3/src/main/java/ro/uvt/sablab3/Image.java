package ro.uvt.sablab3;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void prints(){
        System.out.println(imageName);
    }
    @Override
    public String toString()
    {
        return imageName;
    }

    @Override
    public void print()
    {
        System.out.print(this);
    }

    @Override
    public void add(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public void remove(Element element)
    {
        throw new UnsupportedOperationException();
    };

    @Override
    public Element get(int index)
    {
        throw new UnsupportedOperationException();
    };
}
