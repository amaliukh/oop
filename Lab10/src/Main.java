import java.io.Serializable;

public class Main {

    public static Object test;

    public static void main(String[] args) {

        BureauOfAcquaintances information = new BureauOfAcquaintances(import java.io.Serializable;

        public class List implements Serializable {
            public String[] container = new String[0];
            int size = 0;

            public String toString() {
                String str = "";
                for(int i = 0; i<container.length; i++) {
                    str += container[i];
                }

                return str ;
            }

            public void add(String a)
            {
                String[] newContainer = new String[container.length + 1];
                for (int i = 0; i < container.length; i++) {
                    newContainer[i] = container[i];
                }
                newContainer[newContainer.length - 1] = a;
                container = newContainer;
            }

            public void clear() {
                String[] newContainer = new String[0];
                container = newContainer;
            }

            public void remove_item(int index) {
                String[] newContainer = new String[container.length  - 1];

                for(int i = 0,k=0; i < container.length; i++)
                {
                    if(i!=index)
                        newContainer[k++] = container[i];
                }

                container = newContainer;

            }
            public int SizeOfArray() {
                return container.length;
            }
            //public  convertToArray(){
            //	string[]
            //}
        });

        System.out.println(information);

    }
}