# Lecture 1. Computer Networks and the Internet

## What is the internet?
- **Hosts** = endpoints that are connected to the Internet. The hosts are running network applications.
- **Communication Links** = The transmission rate is called *bandwidth*. There are two different types of links:
    - **Physical** = a link between two hosts that is physically connected to the Internet. (fiber, copper)
    - **Logical** = a link between two hosts that is connected to the Internet by means of a protocol. (radio, satellite)
- **Packet Switches** = Forwards packets (chunks of data) between hosts.
    - **Router** = Inspects data and chooses which link to use.
    - **Switch** = Forwards packets between multiple links.
- **Internet: "Network of networks"** = Interconnected ISPs (Internet Service Providers)
- **Internet Protocol** = The protocol that allows hosts to communicate with each other. Examples: TCP, UDP, ICMP, IP, HTTP etc.
- **Internet standard** = The set of protocols that are used to communicate with each other.
    - **RFC** = The Internet standard is called a *Request for Comments*.
    - **IETF** = The Internet standard is called an *Internet Engineering Task Force*.
- **Programming Interface** = The programming interface that allows a host to communicate with the Internet. For example via the socket API.

***"protocols define format and order of
messages sent and received among
network entities, and actions taken on
message transmission and reception"***

## Network edge
- **Network edge** = The edge of a network.
    - **Host** = A host is a device that is connected to the Internet.
    - **Server** = A server is a host that is connected to the Internet.

- **Packets** = Host sending information is breaking the information into packets with a length of **L** bits.
- **Links** = are serial connections between two hosts.
    - Packets transmitted one bit at a time at a certain rate **R**.
    - Links transmission rate, link capacity, or link bandwidth.

*Packet Transmission Delay = time needed to transmit a packet with L bits into link = **L (bits) / R (bits/sec)***

- **Propagation Delay** = The delay between the packet being sent and the packet being received.

![Transmission and Propagation Delay](/Images/Lecture1.png)

## Internet Service Provider Access
Different ways of accessing the Internet:
- **xDSL (Digital Subscriber Line)**
    - ADSL, ADSL2, ADSL2+, VDSL, ...
    - Existing telephone lines
    - 1 - 100 Mbps
- **Optical Fiber**
    - 10 Mbps - 100 Gbps
- **DOCSIS (Data Over Cable Service Interface Specification)**
    - DOCSIS/Euro-DOCSIS (European DOCSIS)
    - Internet access over cable TV networks
    - 1 - 200Mbps
- **Wireless broadband**
    - 2.4 GHz - 5 GHz
    - Internet access over mobile phone networks
    - 1 Mbps - 1 Gbps

## The Network Core
- Mesh of interconnected routers
- **Packet Switching**
    - forward packets from one router to the next
    - each packet transmitted at full link capacity

- Packet Switching: store-and-forward
    - Store-and-forward: entire packet must arrive at a router before it can be transmitted on next link.
    - Processing delay: it takes some time for router to process packet before transmitting on next link
        - Check and verify packet
        - Decide what to do with it
        - Third delay component: TR

![Packet Switching](/Images/Lecture1_2.png)

## Internet Protocol Stack
- **Application** = Supporting network applications.
    - FTP, SMTP, HTTP
- **Transport** = process-process data transfer.
    - TCP, UDP
- **Network** = Routing of datagrams from source to destination
    - IP, ARP, routing protocols
- **Link** = data transfer between neighboring network elements
    - Ethernet, wireless, optical fiber, etc.
- **Physical** = Bits "on the wire"
