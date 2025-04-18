package LteratorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObjectList {
    protected List<Object> objects;
    protected int currentIndex;

    public AbstractObjectList() {
        this.objects = new ArrayList<>();
        this.currentIndex = 0;
    }


    public void addObject(Object obj) {
        objects.add(obj);
    }

    public void removeObject(Object obj) {
        objects.remove(obj);
    }

    public List<Object> getObjects() {
        return new ArrayList<>(objects);
    }

    public Object next() {
        if (currentIndex < objects.size() - 1) {
            currentIndex++;
        }
        return objects.get(currentIndex);
    }

    public boolean isLast() {
        return currentIndex == objects.size() - 1;
    }

    public Object previous() {
        if (currentIndex > 0) {
            currentIndex--;
        }
        return objects.get(currentIndex);
    }

    public boolean isFirst() {
        return currentIndex == 0;
    }

    public Object getNextItem() {
        if (currentIndex < objects.size() - 1) {
            return objects.get(currentIndex + 1);
        }
        return null;
    }

    public Object getPreviousItem() {
        if (currentIndex > 0) {
            return objects.get(currentIndex - 1);
        }
        return null;
    }
}