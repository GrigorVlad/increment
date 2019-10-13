import jdk.internal.dynalink.support.ClassLoaderGetterContextProvider;

import java.io.*;

public class MagicCounter implements Counter {

    @Override
    public void increment() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\студентФИВТ\\Курсы СберТех\\multiProc\\counterlab-master\\src\\main\\resource\\value.txt"));
            long value = getValue();
            value += 1;
            writer.write(String.valueOf(value));
            writer.close();
        } catch (IOException exp) {
            exp.printStackTrace();
        }
    }

    @Override
    public long getValue() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\студентФИВТ\\Курсы СберТех\\multiProc\\counterlab-master\\src\\main\\resource\\value.txt"));
            long value = Long.parseLong(reader.readLine());
            reader.close();
            return value;
        } catch (IOException exp) {
            exp.printStackTrace();
            return 0;
        }
    }
}
