package ro.uvt.sablab3;
import java.util.List;

public class Book extends Section{
    public Book(String title, List<Element> content)
    {
        super(title, content);
    }

    @Override
    public String toString()
    {
        StringBuilder content = new StringBuilder();
        String tmp;
        int cont = 0;

        tmp = "Title: " + title_ + "\n";
        content.append(tmp);

        for (Element element : content_)
        {
            tmp = "Element " + Integer.toString(cont);

            content.append(element.toString());

            cont++;
        }

        return content.toString();
    }


    @Override
    public void print() { }

    @Override
    public void add(Element element)
    {
        content_.add(element);
    }

    @Override
    public void remove(Element element)
    {
        content_.remove(element);
    }

    @Override
    public Element get(int index)
    {
        if (index < content_.size())
        {
            return content_.get(index);
        }
        else
        {
            throw new IndexOutOfBoundsException();
        }

    }
}
