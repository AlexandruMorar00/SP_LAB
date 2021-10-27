package ro.uvt.sablab3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Book extends Section{

    private Collection<Author> authors;


    public Book(String name)
    {
        super(name);
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

    public void print()
    {
        for(Author el:authors) {
            el.print();
        }
        super.print();
    }
    public void addAuthor(Author a)
    {
        if(authors==null)
            authors=new ArrayList<>();
        authors.add(a);
    }



    public void addContent(Element element ) {
        super.add(element);
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
