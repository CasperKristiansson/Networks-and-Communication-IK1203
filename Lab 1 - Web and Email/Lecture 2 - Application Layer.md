# Lecture 2. Application Layer

## Principles of Network Applications
Two different ways applications are used to communicate with each other:
- **Client-Server** = Client requests information from server. Server sends information back to client.

    **Server:**
    - always-on host
    - permanent IP address
    - data centers for scaling

    **Client:**
    - communicate with server
    - may be intermittently connected
    - may have dynamic IP addresses
    - do not communicate directly with each other

- **Peer-to-Peer** = Client and Client communicate with each other.
    - No always-on server
    - arbitrary end systems directly communicate
    - complex management

- **Messages**
    - **Type of message** - request, response, notification, error
    - **Message Syntax** - header, body
    - **Message Semantics** - meaning of information in field
    - **Message Rules** - rules for message syntax

Generate a table with the headers: Application, data loss, throughput, time sensitive

|Application|Data Loss|Throughput|Time Sensitive|
|---	|---	|---	|---	|
file transfer|no loss|elastic|no|
e-mail|no loss|elastic|no|
Web documents|no loss|elastic|no|
real-time audio/video|loss-tolerant|audio: 5kbps-1Mbps, video:10kbps-5Mbps|yes, 100’s msec|
stored audio/video|loss-tolerant|audio: 5kbps-1Mbps, video:10kbps-5Mbps|yes, few secs|
interactive games|loss-tolerant|few kbps up|yes, 100’s msec|
text messaging|no loss|elastic|yes and no|

#### **TCP Service**

- reliable transport between sending and receiving process
- flow control: sender won’t overwhelm receiver
- congestion control: throttle sender when network overloaded
- does not provide: timing, minimum throughput guarantee, security
- connection-oriented: setup required between client and server processes

#### **UDP Service**
- unreliable data transfer between sending and receiving process
- does not provide: reliability, flow control, congestion control, timing, throughput guarantee, security, connection setup

TCP is a connection-oriented protocol, whereas UDP is a connectionless protocol. A key difference between TCP and UDP is speed, as TCP is comparatively slower than UDP. Overall, UDP is a much faster, simpler, and efficient protocol, however, retransmission of lost data packets is only possible with TCP.

## Web and HTTP
![URL](/Images/Lecture2.png)

- **HTTP is stateless**
Sses TCP, port 80:
- Stateless protocol
    - Client sends request
    - Server responds
- server maintains no
    - information about past client requests
- **protocols that maintain ”state” are complex!**
    - past history (state) must be maintained
    - if server/client crashes, their views of ”state” may be inconsistent, must be reconciled

#### **Cookies**

what cookies can be used for:
- authorization
- shopping carts
- recommendations
- user session state (Web e-mail)

how to keep ”state”:
- protocol endpoints: maintain state at sender/receiver over multiple transactions
- cookies: http messages carry state