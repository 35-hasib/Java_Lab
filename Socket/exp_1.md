# _Server_
```java

import java.io.*;
import java.net.*;

public class server {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(1234);
        Socket socket = ss.accept();

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        dos.writeUTF("Hello Client !!");
        System.out.println(dis.readUTF());

        // System.exit(0);
    }
}

```

# _Client_
---
```java

import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost",1234);

        DataInputStream dis = new DataInputStream(socket.getInputStream());
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

        System.out.println(dis.readUTF());
        dos.writeUTF("Hello Server !!");

        // System.exit(0);
    }
}

```
