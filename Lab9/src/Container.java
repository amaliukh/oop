import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Container implements Iterable<String> {

    private static int el;
    private String[] arr = new String[el];

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < el; i++) {
            buff.append(arr[i] + " ");
        }
        return buff.toString();
    }
    public void add(String string) {
        el++;
        final int size = arr.length;
        arr = Arrays.copyOf(arr, size + 1);
        arr[size] = string;
    }
    public void clear() {
        arr = new String[el];
    }
    public boolean remove(String string) {
        if(el == 0)
            return false;
        String[] del = new String[el];
        del = arr;
        int j;
        for (j = 0; j < el; j++) {
            if (del[j].equals(string))
                break;
            else if(j == el - 1)
                return false;
        }
        for (int k = j; k < el - 1; k++)
            del[k] = del[k + 1];
        el--;
        arr = new String[el];
        for(int i = 0; i < el; i++)
            arr[i] =del[i];
        return true;
    }
    public Object[] toArray() {
        return arr;
    }
    public int size() {
        return el;
    }
    public boolean contains(String string) {
        for(int i = 0; i < el; i++) {
            if(arr[i].equals(string))
                return true;
        }
        return false;
    }
    public boolean containsAll(Container container) {
        for(int i = 0; i < el; i++) {
            if(container.arr[i].equals(arr[i]))
                return true;
        }
        return false;
    }
    public void sort(final String[] arr) {
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(final String str1, final String str2) {
                return str1.toString().compareTo(str2.toString());
            }
        });
    }
    public String[] search(final int length) {
        String[] validStr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == length) {
                validStr[i] = arr[i];
            }
        }
        return validStr;
    }
    public void compare() {
        String equalElems = "";
        int countOfEqual = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i].equals(arr[j])) {
                    equalElems += arr[i];
                    countOfEqual++;
                }
            }
        }
        if (equalElems.isEmpty()) {
            System.out.println("Немає однакових елементів");
        }
        else {
            countOfEqual++;
            System.out.println(equalElems + " - " + countOfEqual);
        }
    }

    @Override
    public ContainerIter<String> iterator() {
        return new ContainerIter<String>(arr);
    }

    @SuppressWarnings("hiding")
    class ContainerIter<String> implements Iterator<String> {
        private int low;
        private int high;
        public ContainerIter(String[] array) {
            this.low = 0;
            this.high = array.length - 1;
            el = array.length;
        }

        @Override
        public boolean hasNext() {
            return this.low <= this.high;
        }

        @Override
        public String next() {
            int temp;
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            temp = low;
            low++;
            return (String) arr[temp];
        }

        @Override
        public void remove() {
            if (low < high + 1) {
                arr = Arrays.copyOf(arr, el - 1);
            }
            el--;
            high--;
        }
    }
}