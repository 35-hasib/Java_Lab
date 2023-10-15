__Server__
---
```java

import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main(String[] args) throws IOException {
        try{
        ServerSocket ss = new ServerSocket(1234);
        Socket socket = ss.accept();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        Scanner input = new Scanner(System.in);

        while(true){
            //Input Stream
            System.out.print("Enter Radius Of a Circle :");
            int a = input.nextInt();
            String s = String.valueOf(a);
            dos.writeUTF(s);
            if(a == -1){
                dos.writeUTF(s);
                System.exit(0);
            }

            // Output Stream
            int b = Integer.valueOf(dis.readUTF());
            double c = Double.valueOf(b);
            if(b == -1){
                System.exit(0);
            }
            c=c*c*3.14;
            System.out.println("Area Of this Circle is :"+c);
        }}
        catch(Exception e){
            System.exit(0);
        }

    }
}

```

__Client__
---
```java

import java.io.*;
import java.net.*;
import java.util.*;

public class client {
    public static void main(String[] args) throws IOException{
        try{
        Socket socket = new Socket("localhost", 1234);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        Scanner input = new Scanner(System.in);

        while(true){
            // Output Stream
            int b = Integer.valueOf(dis.readUTF());
            double c = Double.valueOf(b);
            if(b == -1){
                System.exit(0);
            }
            c=c*c*3.14;
            System.out.println("Area Of this Circle is :"+c);

            // Input Stream
            System.out.print("Enter Radius Of a Circle :");
            int a = input.nextInt();
            String s = String.valueOf(a);
            dos.writeUTF(s);
            if(a == -1){
                dos.writeUTF(s);
                System.exit(0);
            }
        }}
        catch(Exception e){
            System.exit(0);
        }
    }
}

```
