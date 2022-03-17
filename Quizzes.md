# Home Assignment 1 Quiz
**Question 1: Combine the following network access methods with the correct network technologies.**

- IEEE 802.11b/g/n -> Wireless local access
- Ethernet -> Wired local access
- ADSL -> Access over the fixed telephone network
- 3G, 4G (LTE) -> Access over mobile networks
- DOCSIS -> Access over cable tv networks


**Question 2: The questions is about the structure of the Internet. The Internet can be described as consisting of different kinds of organization, often companies, mainly Internet Service Providers (ISPs) and Internet Exchange Points (IXPs). We distinguish between to types of ISPs: Tier 1 ISPs and Access ISPs. Combine the descriptions below with the correct organization types:**

- Connects to the end user (home, company, university, etc) -> Access ISP
- Often has international coverage -> Tier 1 ISP
- A meetling place where ISPs connect to each other -> IXP
- Is usually a customer of one (or more) Tier 1 ISPs, and is being charged for sending and receiving traffic -> Access ISP
- Have mutual agreements for exchanging traffic with each other, free of charge ("peering agreements") -> Tier 1 ISP


**Question 3: Assume a simple model of the Internet with computers ("hosts"), switches ("routers") and links. For each layer in the Internet protocol stack, choose the description of its functionality that matches best. (When two devices are "directly connected", it means that there are no routers in between.)**

- Application layer -> Rules for communication between processes on different hosts that together make up an application.
- Transport layer -> Provides support for communication between processes on different hosts.
- Network layer -> Provides support for communication between hosts via nay routers in between.
- Link layer -> Provides support for communication between directly connected routers or hosts.
- Physical layer -> Defines for instance electrical and optical properties of a link


**Question 4: Combine the protocols below with the correct layer in the Internet protocol stack.**

- Application layer -> SMTP
- Transport layer -> TCP
- Network layer -> IP - Internet Protocol
- Link layer -> Ethernet


**Question 5: This question is about communication according to the client-server application architecture. Which of the following statements are correct about the client-server architecture?**

- [x] Clients do not communicate directly with each other.
- [ ] A client has a fixed address in the network. 
- [x] In practice, a server can consist of many computers that are reached at a common address.
- [ ] A server deals with only one client at a time.
- [x] A server has a fixed address in the network.


**Question 6: What statements are correct about communication according to the peer-to-peer application architecture (P2P)?**

- [ ] P2P networks are controlled by special servers, so called super nodes, which are owned and managed by the organization that controls the network.
- [x] A P2P network has no predefined structure. Instead, it is formed dynamically by the nodes ("peers") that for the moment are participating in the network (sharing a file, for instance).
- [ ] P2P networks are for distribution of copyright-protected material, and therefore illegal.
- [x] P2P networks rely on the principle that users make their resources available for sharing (resources for storage, communication, processing, etc).
- [ ] In a P2P network, there is no need for port numbers.


**Question 7: Consider the following statements about World Wide Web applications. What is true? (This question is about HTTP/1.1, as covered in the textbook and the lectures.)**

- [x] By using web caches it is possible to reduce the response time for client requests.
- [ ] HTTP is a "stateful" protocol, meaning that an HTTP server maintains "state" to keep track of the clients that are currently visiting the site.
- [x] HTTP is a text-based protocol (not binary), which means that HTTP requests and responses are transmitted in text format.
- [ ] HTTP is used to transfer HTML pages. Other types of web objects (such as images) are transmitted with FTP.
- [x] Each web object (page, image, movie, etc.) has a unique identifier that can be used to address the object.


**Question 8: You want to use your web browser to fetch a web page from a site called "www.wagstaff.info". Its web server is at TCP port 8080, and the page you are looking for is called "horse.html". Give the URL that you enter into the navigation field of your web browser.**

http://www.wagstaff.info:8080/horse.html or https://www.wagstaff.info:8080/horse.html

# Home Assignment 2

**Question 1: Which of the following statements about TCP are correct?**

- [x] The flow control used by TCP normally gives superior performance compared to stop-and-wait.
- [ ] All segments of a TCP connection will follow the same path through the network. 
- [ ] TCP and UDP will share the available bandwidth in fair manner. 
- [x] TCP includes mechanisms both for flow control and for congestion control. 
- [x] The retransmission timeout used by TCP depends partly on the distance between sender and receiver.
- [x] Before data can be transmitted, a connection has to be established.
- [ ] Assume we use TCP to transfer a file. If a segment in the middle is lost, TCP has to wait for a timeout before the segment can be retransmitted.
- [ ] TCP can guarantee that an application gets the bandwidth it requires.


**Question 2: Which of the following statements about DNS are true?**

- [x] A DNS server uses caching to be able to answer queries faster. 
- [x] Each organization, company, etc., that has a domain name is also responsible for answering DNS queries about its domain.
- [ ] A client that wants to do a DNS lookup sends its query to a root server.  
- [ ] DNS is a distributed database and therefore does not use the client-server model of communication.
- [x] An organization's local DNS server (or default name server) helps other computers within the organization to resolve DNS queries.
- [x] An authoritative DNS server knows the answers to queries about names in the domain for which it is responsible ("kth.se", for example).


**Question 3: Which of the following statements about TCP congestion control are correct?**

- [ ] The congestion window always increases in size until there is a timeout at the sender. 
- [x] During the slow start phase, the congestion window increases exponentially in size. 
- [ ] Initially, the congestion window is 65535 bytes. 
- [ ] With fast retransmit and fast recovery retransmissions are made for each duplicate ACK.
- [x] During the congestion avoidance phase, the congestion window increases linearly in size.


**Question 4: Assume a reliable transport protocol of the same kind as described in the course book and the lectures (rdt 3.0 in the book), and that the protocol must work over a network where both bit errors and packet loss can occur. This protocol uses several mechanisms to detect and deal with the errors above, mainly timers, sequence numbers, checksums, and acknowledgements (ACKs).**

- [x] We can deal with packet loss through the use of sequence numbers, ACKs, and timers. Checksums are not needed.
- [ ] It is sufficient with checksums and ACKs to deal with bit errors (in data and ACKs). Neither sequence numbers nor timers are needed.
- [ ] We need checksums, ACKs, and timers to deal with bit errors (in data and ACKs). Sequence numbers are not needed.
- [ ] We can deal with packet loss using only sequence numbers and ACKs. Timers and checksums are not needed.
- [ ] We can deal with packet loss and duplicates using only ACKs and timers. Sequence numbers and checksums are not needed.
- [x] It is sufficient with checksums, ACKs, and sequence numbers to deal with bit errors (in data and ACKs). Timers are not needed.


**Question 5: TCP is connection oriented, which means that it has to deal with connection establishment and termination. Which of the following statements are true?**

- [x] When a TCP connection is being established, the very first segment sent is a TCP SYN segment.
- [x] When TCP closes a connection, it normally uses a 4-way handshake. 
- [ ] When a connections is closed in TCP, it has to be initiated by the same side that initiated the connection establishment.
- [ ] The initial sequence number selected by TCP is normally 0, but in some implementations it is 1.
- [ ] TCP's way of closing a connection makes it vulnerable to a denial-of service attack.


**Question 6: TCP and UDP are both transport layer protocols, but they operate very differently. Which of the following alternatives are correct?**

- [ ] The TCP checksum can be turned off through the API used (the socket API). 
- [x] UDP can protect data with a checksum, but does not always do that. 
- [x] A server supporting both TCP and UDP can use the same port number for communicating with one client over UDP and another client over TCP.
- [x] A UDP sender can "starve out" a TCP sender from the network. 
- [ ] A TCP-based server communicating with several clients in parallel is normally doing so over one single connection.


**Question 7: We have studied two different protocols for flow control: Go-Back-N and Stop-and-wait. Below is a list of properties. Choose the protocol(s) for which the property is valid.**

- Requires the sender to buffer multiple packets -> Go-Back-N
- Packet loss can require retransmission even of several correctly delivered packets -> Go-Back-N
- Use "cumulative ACKs" -> Go-Back-N
- Normally gives lowest utilization of available network capacity -> Stop-and-Wait
- Two sequence numbers are sufficient -> Stop-and-Wait


**Question 8: Assume we have a transport level connection with a capacity of 8 Mbit/s and that the delay between sender and receiver is 5 ms (one-way). Which is the optimal window size in bytes that the sender should use? Hint: calculate the bandwidth-delay product. Answer in number of bytes (not kB, not bits). Give only the value without units as your answer.**

Optimal window size = capacity x RTT = 8 Mbit/s x 10 ms = 10000 bytes

***NOTE: 8 * 125000 x 0.01 = 10000***


**Question 9: DNS can be seen as a distributed database. What kind of lookup operations (or translations) are supported by DNS?**

- [x] Name to name 
- [x] Name to authoritative DNS server 
- [x] Name to IPv4 address 
- [x] Name to mail server 
- [x] Name to IPv6 address


**Question 10: Web cookies, or HTTP cookies, are used by many web servers, for different purposes. Which of the following statements about web cookies are true?**

- [ ] By examining a cookie in my web browser, I can determine what information the web server has about me.
- [x] By using cookies, a web server can keep track of when a user last visited the site. 
- [x] Cookies are created by the web server and stored in the web client. 
- [ ] Cookies are small programs that are executed in the web browser. 
- [x] By using cookies, web servers can for instance keep track of user-specific information, such as shopping baskets.
- [ ] A web server can ask to see all cookies that the web browser has.


**Question 11: You have just started your computer and the first thing you do is to open a web browser to visit the site "www.kth.se". Which  application and transport layer protocols need to be involved in order to fetch the web page to your browser?**

- [ ] BitTorrent
- [x] UDP
- [ ] MIME
- [ ] POP
- [x] HTTP
- [x] TCP
- [ ] SMTP
- [ ] IMAP
- [x] DNS

# Home Assignment 3 quiz

**Question 1: We have discussed two main routing algorithms: link state and distance vector. For each of the statements below, specify the routing algorithm for which the statement is valid.**

- A node sends information to all other nodes in the network. -> Link state
- A node sends information only to its neighbors. -> Distance vector
- Uses Dijkstra's algorithm to find the best routes. -> Link state
- Uses Bellman-Ford's algorithm to find the best routes. -> Distance vector
- Is used in OSPF. -> Link state
- Is used in RIP. -> Distance vector


**Question 2: OSPF, RIP, and BGP are three well-known Internet routing protocols. Specify for each of the statements the routing protocol for which the statement is valid.**

- Has a limitation to networks with a "diameter" of max 15 hops. -> RIP
- Uses "poison reverse" to avoid loops where packets are sent back and forth between two routers. -> RIP
- Protocol messages are sent directly on top of IP, without using any transport protocol (such as UDP or TCP). -> OSPF
- Can be used to divide an operator's internal network into several smaller networks in a hiearchical structure. -> OSPF
- Is used to communicate routing information between network operators. -> BGP
- Is based on dividing the Internet into so called autonomous systems. -> BGP


**Question 3: Which of the following statements about IP routing are correct?**

- [ ] BGP uses Dijkstra's algorithm to calculate the shortest path between two nodes.
- [ ] RIP is a link state protocol.
- [x] OSPF and IS-IS are link state protocols.
- [ ] OSPF is a distance vector protocol. 
- [x] RIP is a distance vector protocol. 


**Question 4: Which of the following statements about IP routing are correct?**

- [ ] In a distance vector protocol a node sends its distance vector to all other nodes in the network.
- [ ] To deal with large networks consisting of many nodes, RIP has support for dividing the network into smaller areas.
- [x] OSPF uses flooding to communicate link status to other nodes in the network.
- [ ] OSPF has normally a longer convergence time compared to RIP. 
- [x] In a distance vector protocol a node sends its distance vector to the neighbour nodes. 


**Question 5: A router (for IP version 4) has the forwarding table below and lookups are made using the longest prefix match principle.**

| Destination 	| Interface 	|
|---	|---	|
| 0.0.0.0/0 	| m0 	|
| 172.58.128.0/17 	| m1 	|
| 172.58.128.0/19 	| m2 	|
| 172.58.160.0/19 	| m3 	|

**Assume that the router forwards packets towards the following destinations. For each destination address, give the outgoing interface.**

- 172.58.124.36 -> m0
- 172.59.12.142 -> m0
- 172.58.218.80 -> m1
- 172.58.155.112 -> m2
- 172.58.165.90 -> m3
- 172.58.169.18 -> m3


**Question 6: Consider an IP subnet with prefix 123.45.67.0/25. Assume that one router is connected to the subnet. Which of the following statements are correct?**

- [x] 123.45.67.46 is a valid address on the subnet. 
- [x] There are 128 addresses on the subnet. 
- [ ] A computer on the subnet sending an IP packet to address 123.45.67.67, will send it through the router.
- [ ] Up to 255 different computers can be connected on the subnet at the same time. 
- [x] Assume that another port on the router is connected to 123.45.67.128/25. The router can then aggregate the two subnets to one prefix: 123.45.67.0/24.
- [ ] 123.45.67.146 is a valid address on the subnet. 


**Question 7: DHCP (Dynamic Host Configuration Protocol) is used for automatic configuration of a network interface. Such a configuration includes several parts. Consider the case when a computer is connected to an IP subnet where there is a DHCP server. Which of the following configuration items are provided through DHCP?**

- [x] Information about what addresses that are included in the subnet. 
- [x] The IP address for the computer's network interface
- [ ] The name of the outgoing mail server.
- [x] The IP address to the router which connects the subnet to the rest of the Internet.
- [x] The IP address for a local DNS server.
- [ ] The MAC address for the computer's network interface.


**Question 9: All media we use for communication, from the wire in a tin can telephone, to copper cables, optical fibers, and radio channels, are unreliable. In other words, the message that we send may not arrive correctly at the receiver. Below are a number of methods for error detection and correction. Match the methods with the properties they have.**

- Cyclic Redundancy Check (CRC) -> Detects single bit errors and burst errors up to a certain burst length.
- Internet checksum -> Detects single bit errors
- Simple parity -> Detects single bit errors
- Two-dimensional parity -> Detects and corrects single bit errors


**Question 10: CSMA (Carrier-Sense Multiple Access) protocols are used to coordinate access to a shared medium. This question is about CSMA protocols in general, and CSMA/CA and CSMA/CD in particular.**

- [ ] By listening ("Carrier Sense") before sending, CSMA protocols make sure that there can be no collisions.
- [x] With CSMA/CD, the transmitting nodes detect if there is a collision, and abort their transmissions.
- [ ] CSMA/CD is used primarily for wireless networks, where the probability for collisions is high.
- [x] By distributing transmission starting times in a randomized way, CSMA/CA reduces the probability that several nodes start transmitting at the same time,.
- [ ] CSMA relies on the presence of a common reference clock, to which all nodes are synchronized.
- [ ] With CSMA/CA, the transmitting nodes detect if there is a collision, and abort their transmissions.


# Home Assignment 4

**Question 1: Consider the following statements about wireless LAN (WLAN) according to the  IEEE 802.11 standard. What statements are correct? (A wireless unit could be a computer with a wireless interface or a smartphone, for instance.)**

- [x] A wireless unit needs to register with an access point before it can use the wireless network.
- [ ] An access point is an IP router that routes IP packets between a wireless network and a fixed network.
- [ ] The available radio frequency range is divided into channels. An access point uses all available channels simultaneously. 
- [x] Traffic between wireless units within the same BSS (Basic Service Set) goes via the access point.
- [x] Wireless LANs (such as IEEE 802.11) and wired LANs (such as IEEE 802.3) use different frame formats.
- [ ] A wireless unit can send a frame to several access points at the same time.


**Question 2: Ethernet is the dominating standard for (wired) LANs. Which of the following statements are correct?**

- [ ] Ethernet's approach for detecting collisions is based on that the receiver acknowledges correctly received frames to the sender.
- [x] The Ethernet standard supports several different technologies for the physical layer, such as twister pair ("TP") cable and optical fiber.
- [ ] Ethernet automatically retransmits frames with bit errors. 
- [x] Ethernet is based on CSMA/CD. 
- [x] Ethernet does not require all nodes to have synchronized clocks; instead, transmitter and receiver are synchronized at the point of transmission.
- [ ] Ethernet uses IP addresses to identify sender and receiver. 


**Question 3: Considering the following statements about Ethernet networks with switches. What is true?**

- [x] A switch learns the location of nodes by observing the traffic that passes through the switch.
- [ ] If there is more than one switch in the network, the switches use ARP to learn the location of nodes.
- [x] In a switched network, multiple nodes can transmit at the same time. 
- [ ] In a switched network, there can only be as many nodes as there are ports on the switch.


**Question 4: Which of the following statements are correct about medium access according to CSMA/CA for IEEE 802.11 wireless networks ("WLAN")?**

- [x] The RTS/CTS handshake is optional and hence does not need to be used for each frame transmission.
- [x] A collision is discovered by the sender not receiving an acknowledgement ( ACK frame) from the receiver.
- [ ] DIFS is a time constant that tells how long a node should wait before sending after it has discovered that the channel is busy.
- [ ] The RTS/CTS handshake does not help to deal with the "hidden terminal" problem.
- [ ] Unlike CSMA/CD, a node does not need to listen before sending. 


**Question 5: Which of the following statements about ARP and MAC-addresses are correct?**

- [x] Unlike IP addresses, MAC addresses don't need to be configured.
- [ ] MAC addresses are assigned through DHCP (Dynamic Host Configuration Protocol).
- [x] A computer has the same MAC-adress, no matter to which network it is connected.
- [ ] The ARP protocol uses DNS (Domain Name System) to translate addresses. 


**Question 6: This question is about address tables in Ethernet switches and how they are updated. Consider a simple network with three Ethernet switches: A, B och C. They are connected in sequence: A – B – C. To each switch, a computer is connected: computer a is connected to switch A, computer b to switch B, and computer c to switch C. Suppose that the network has just been brought into operation and all address tables (switch tables) are empty. Computer a sends a frame addressed to computer b, which responds by sending a frame a. Answer the following questions about when address information is stored in the address tables in the different switches:**

- Information about computer a is stored in the address table in switch A -> During the transmission from a to b
- Information about computer b is stored in the address table in switch A -> During the transmission from b to a
- Information about computer a is stored in the address table in switch B -> During the transmission from a to b
- Information about computer b is stored in the address table in switch B -> During the transmission from b to a
- Information about computer a is stored in the address table in switch C -> During the transmission from a to b
- Information about computer b is stored in the address table in switch C -> Not during any of the two transmissions


**Question 7: Which of the following functions belong in the link layer?**

- [ ] Avoid network congestion
- [x] Coordinate access to a common, shared medium.
- [x] Flow control
- [x] Detect bit errors
- [ ] Find a way from source to destination through a network of routers.


**Question 8: Give explanations for the following concepts in wireless networks:**
- Base station -> Connects a wireless network to a fixed network
- Infrastructure mode -> Network with base stations
- Ad hoc mode -> Self-organizing network without base stations
- Handoff -> Mobile node moves between base stations
- Wireless link -> Shared medium coordinated with medium access protocol


**Question 9: CSMA (Carrier-Sense Multiple Access) protocols are used to coordinate access to a shared medium. This question is about CSMA protocols in general, and CSMA/CA and CSMA/CD in particular.**

- [ ] With CSMA/CA, the transmitting nodes detect if there is a collision, and abort their transmissions.
- [ ] By listening ("Carrier Sense") before sending, CSMA protocols make sure that there can be no collisions.
- [x] With CSMA/CD, the transmitting nodes detect if there is a collision, and abort their transmissions.
- [x] By distributing transmission starting times in a randomized way, CSMA/CA reduces the probability that several nodes start transmitting at the same time,.
- [ ] CSMA relies on the presence of a common reference clock, to which all nodes are synchronized.
- [ ] CSMA/CD is used primarily for wireless networks, where the probability for collisions is high. 

# Home assignment 5

**Question 1: A router has the forwarding table below.**

| Destination 	| Next hop 	| Interface 	|
|---	|---	|---	|
| 111.0.0.0/8 	| - 	| m0 	|
| 192.16.7.0/28 	| 193.14.5.193 	| m1 	|
| 193.14.5.160/27 	| - 	| m2 	|
| 193.14.5.192/27 	| - 	| m1 	|
| 194.17.21.16/32 	| 111.20.18.14 	| m0 	|
| 192.16.7.0/24 	| 111.15.17.32 	| m0 	|
| 194.17.21.0/24 	| 111.20.18.14 	| m0 	|
| 0/0 	| 111.30.31.18 	| m0 	|

- [x] A packet with destination address 192.16.7.13 will have next hop 193.14.5.193 and be forwarded onto interface m1.
- [ ] A packet with destination address 192.16.7.231 will have next hop 193.14.5.193 and be forwarded onto interface m1.
- [x] A packet with destination address 193.14.5.225 will have next hop 111.30.31.18 and be forwarded onto interface m0.
- [ ] A packet with destination address 193.14.5.166 will have next hop 111.30.31.18 and be forwarded onto interface m0.


**Question 2: Which of the fields in the IP header are used specifically for fragmentation and reassembly?**

- [x] Flags
- [ ] Type of service
- [x] Identifier
- [ ] Upper layer
- [ ] Options
- [x] Fragment offset


**Question 3: For each layer in the Internet protocol stack, select the description of a function that best matches.**

- Application layer -> Communication between two programs that together make up a distributed system
- Transport layer -> Communication between two processes on different computers.
- Network layer -> Communication between two different computers, including the choice of route through the network.
- Link layer -> Communication between two directly connected computers, including addressing if it is a shared medium.
- Physical layer -> Communication and coding of data in a way that suits the underlying physical medium.


**Question 4: Assume we have a subnet 123.45.67.0/25, and that there is one router connected to this subnet through one of its interfaces. Which of the following statements are correct?**

- [x] 123.45.67.64 is a valid address on the subnet. 
- [ ] There are 256 different IP addresses on the subnet. 
- [x] 123.45.67.46 is a valid address on the subnet. 
- [ ] 123.45.67.146 is a valid address on the subnet. 
- [x] If a host on the subnet sends a packet with destination address 123.45.67.139, it will go through a router.
- [x] Assume that 123.45.67.128/25 is to be aggregated with 123.45.67.0/25. The resulting aggregated network will then be 123.45.67.0/24.


**Question 5: What is the name of the mechanism TCP uses for flow control?**

sliding windows (sliding window)


**Question 6: Here follows a mix of various statements about link layer protocols and equipment. Which of the statements are correct?**

- [x] Ethernet has gone from a shared bus topology to a star topology with an active switch in the middle. This was necessary in order to bring Ethernet to gigabit speed and beyond.
- [ ] Ethernet is for carrying Internet traffic. Hence, an Ethernet switch only knows how to switch IP datagrams. 
- [x] Ethernet (IEEE 802.3) and WLAN (IEEE 802.11) both use the same MAC address format and the same MAC address space. 
- [ ] A switch that encounters a MAC destination address that it does not recognize, uses ARP to find out where the recipient is. 
- [ ] An Ethernet switch forwards frames through broadcasting, so that each frame is sent on all ports


**Question 7: Which of the following functions belong in the link layer?**

- [x] Detect bit errors 
- [ ] Avoid network congestion 
- [ ] Find a way from source to destination through a network of routers. 
- [x] Coordinate access to a common, shared medium. 
- [x] Flow control 


**Question 8: Consider the following statements about the network layer in general and IP routers in particular. Which of the statements are correct?**

- [x] Information in an IP header is examined by every router the packet passes through, for example to decide how a packet is to be forwarded. 
- [ ] A router does not change any information in an IP header. 
- [ ] If an overloaded router can't accept more packets it will send an ICMP message back to the sender.
- [ ] Routers use the identifier field of the IP header to make sure that packets arrive in correct order. 
- [ ] Before an IP packet can be sent, a connection must be established between sender and receiver. 
- [x] Routers have a buffer memory for temporary storage of IP packets that are passing through the router. 
- [ ] Fragmentation means that a router which detects bit errors drops packets with errors.


**Question 9: A user sends an email message from a computer to another user over the Internet. The other user receives and reads the email on his/her computer. The message is transfered in several steps over the Internet, in this case with the e-mail protocols SMTP and IMAP. Which of the following alternatives represents a valid (and likely) order in which the protocols are used?**

- [ ] IMAP, IMAP, SMTP 
- [ ] IMAP, SMTP, SMTP 
- [ ] SMTP, IMAP, SMTP 
- [x] SMTP, SMTP, IMAP 
- [ ] SMTP, IMAP, IMAP 
- [ ] IMAP, SMTP, IMAP


**Question 10: You want to use your web browser to get a page from a server called "www.secret.com". The web server is at port 8800, the page on the server is called  "keys.html", and you wish to use a secure (encrypted) HTTP transfer to get the page. Specify the URL that you type into the navigation field of the web browser. Note! Specify a valid URL as answer, nothing else. There should be no other characters in the answer, no whitespaces, etc.**

https://www.secret.com:8800/keys.html


**Question 11: Assume we have a transport level connection with a capacity of 10 Mbit/s and that the connection between sender and receiver has an RTT of 4 ms. Which is the optimal window size in bytes that the sender should use? Answer in number of bytes (not kB, not bits).**

5000 -> Optimal window size = capacity x RTT = 10 Mbit/s x 4 ms = 40000 bits = 5000 bytes


**Question 12: Which of the following statements about DNS are correct?**

- [ ] A top-level domain name server responds with the IP address of the requested domain. 
- [ ] An authoritative domain name server responds with the name of the domain name server that can finally answer the query. 
- [ ] DNS provides one single service: to translate a name to an IP address. 
- [x] A local domain name server uses caching in order to be able to quickly answer similar queries. 
- [x] A local domain name server helps other computer to make DNS queries. 
- [ ] A root domain name server performs recursive lookups on behalf of the requesting clients.


**Question 13: Which of the following statements about UDP are correct?**

- [x] UDP does not have any mechanisms to deal with congestion. 
- [x] UDP leaves it up to the application to decided how to deal with packet loss and bit errors. 
- [x] UDP has a checksum to detect bit errors, but it is not always used by the applications using UDP. 
- [ ] UDP guarantees that all UDP packets between a sending and receiving process take the same path through the network. 
- [ ] UDP has a retransmission mechanism to deal with packet loss, but it is not always used by the applications using UDP. 
- [ ] If a client sends two messages to a server, UDP will guarantee that they arrive in the correct order.


**Question 14: Which of the following statements are valid for the link layer?**

- [ ] Any link layer protocol must perform error detection and error correction. 
- [x] One important function of the link layer is to coordinate how senders get access to the physical medium for communication. 
- [ ] Wireless networks (WLAN, 3G networks) are examples of point-to-point connections. 
- [x] The link layer protocols are often implemented in hardware (entirely or partially). 
- [ ] The link layer's own addresses, the so called MAC addresses, have an important role for Internet routing.


# Check Writing One

**Question 1 You are an engineer at a networking company. You get a new project, which has the following description: "We have developed devices that can be connected together into a network. Your job is to design a protocol that makes it possible for any pair of programs running on two devices at different places in a network to communicate with each other." How would you characterise the protocol you should design?**

- [x] Transport layer protocol 
- [ ] Application layer protocol 
- [ ] Link layer protocol 
- [ ] Network layer protocol 
 

**Question 2: Two nodes A and B are connected with cables to a packet switch P.  The length of the cable between A and P is 10 km, and the length of the cable between B and P is 20 km. The bitrate of each cable is 50 Mbit/s, and the signal propagation speed is 2×108 m/s. The packet processing time in P is 2 µs (microseconds). A sends a packet to B. The size of the packet is 800 byte. What is the total transfer time? In other words, how long does it take from that A starts sending the packet until B has received the entire packet?**

- [ ] 308 µs 
- [ ] 184 µs 
- [x] 408 µs 
- [ ] 280 µs 
 

**Question 3: DNS (Domain Name System) is a distributed database on the Internet. Which of the following queries is not supported by DNS? (Example queries are given within parentheses.)**

- [x] Finding the default router connecting a domain to the Internet (query: "kth.se", answer: "gateway.kth.se") 
- [ ] Finding the email server for a given domain name (query: "kth.se", answer: "mx.kth.se") 
- [ ] Finding the authoritative name server(s) for a domain name (query: "kth.se", answer "ns.kth.se") 
- [ ] Finding the IP version 6 address for a given host name (query: "www.kth.se", answer: "2001:6b0:1:11c2::82ed:1c28") 
 

**Question 4: Consider the following statements about HTTP, the HyperText Transfer Protocol for web communication. Which is true?**

- [ ] All HTTP communication is encrypted, and therefore HTTP is always safe to use. 
- [ ] HTTP usually runs on top of UDP. 
- [ ] HTTP can be described as a request-response protocol. 
- [ ] HTTP is a connection-oriented protocol, where the client needs to establish an HTTP connection to the server prior to fetching a web page. 
 
**Question 5: A client process is implemented using the sockets API (application programming interface). The sockets API includes the following operations (and many more), where the short descriptions are from the Linux manual pages:**
- accept – accept a connection on a socket
- bind – bind an address to a socket
- connect – initiate a connection on a socket
- listen – listen for connections on a socket

**When the clients starts, it performs a sequence of these operations. What represents a likely sequence of operations for the client:**
- [ ] accept, bind 
- [ ] bind, connect 
- [ ] accept, connect 
- [x] connect 
 

**Question 6: Which of the following statements about UDP is (most) correct?**
- [x] UDP can detect bit errors in packets and will then drop them. 
- [ ] UDP detects lost packets, but will not retransmit them. 
- [ ] UDP detects lost packets, and will retransmit them. 
- [ ] UDP cannot detect bit errors in packets. 
 
**Question 7: Assume that we run TCP Reno and that we have a TCP connection that has been up and running for a while. The TCP sender has just received three duplicate ACKs and starts a new congestion avoidance phase with a congestion window of 12000 bytes in transmission round 4201. The maximum segment size is 1500 bytes and the TCP sender always has data in the send buffer so that it can send full size TCP segments. During this congestion avoidance phase, the receiver announces a receiver window of 18 000 bytes. In what transmission round will the TCP sender's congestion window reach the receiver's announced window size, provided that no timeout occurs and no duplicate ACKs are received?**

- [ ] Not until transmission round 4209 
- [x] Not until transmission round 4205 
- [ ] Not until transmission round 4207 
- [ ] Not until transmission round 4203 
 

**Question 8: A TCP sender has a send window of 24000 bytes and sends data to a receiver over a 10 Mbps link. The one-way delay to the receiver is 10 ms. What is the maximum throughput that can be achieved?** 

- [ ] 1.2 Mbps 
- [ ] 10 Mbps 
- [x] 9.6 Mbps 
- [ ] 19.2 Mbps 
 

**Question 9: Assume that a number of TCP flows and UDP flows are running over the same link and thus sharing the available capacity. Which of the following is then most likely to happen?**
- [ ] The TCP flow that started first will get most capacity. 
- [ ] The TCP flows will starve out the UDP flows. 
- [x] The TCP flows will fairly share the capacity not used by UDP. 
- [ ] TCP and UDP will fairly share the available capacity. 
 

**Question 10: Which of the following statements about TCP connections is (most) correct?**
- [ ] When a TCP connection is being established, a SYN message is sent in both directions with the same initial sequence number, so that both sides of the connection start sending data with the same sequence number. 
- [x] When a client is establishing a TCP connection to a server, it can piggyback data on the ACK sent to acknowledge the server's initial sequence number. 
- [ ] The very first TCP message sent when a TCP connection is being established has both the SYN flag and the ACK flag set. 
- [ ] The first TCP message sent when a TCP connection is being established always has the RST flag (RESET) set.


# Check Writing Two

** Question 1: Consider the following forwarding table below.**

| Prefix 	| Outgoing interface 	| Interface 	|
|---	|---	|---	|
| 172.58.128.0/20 	| m1 	| m0 	|
| 172.58.128.0/22 	| m2 	| m1 	|
| 172.58.136.0/22 	| m3 	| m2 	|
| 0.0.0.0/0 	| m0 	| m1 	|
| 0.0.0.0/0 	| m0 	| m0 	|
| 192.16.7.0/24 	| 111.15.17.32 	| m0 	|
| 194.17.21.0/24 	| 111.20.18.14 	| m0 	|
| 0/0 	| 111.30.31.18 	| m0 	|

**Specify the outgoing interface for an IP packet with the destination address**
172.58.130.98

- [ ] m1 
- [ ] m3 
- [x] m2 
- [ ] m0 
 

**Question 2: Which of the following statements about DCHP (Dynamic Host Configuration Protocol) is correct?**
- [ ] DHCP cannot be used to inform a host about which DNS server to use. 
- [ ] DHCP uses TCP as the transport protocol. 
- [ ] DHCP is one of the few exceptions when it is allowed to use a broadcast address (255.255.255.255) as source address. 
- [x] DHCP can be used for time-limited assignment of IP addresses. 
 

**Question 3: Consider a subnet (IP version 4) with the prefix 10.18.19.0/24. Which of the following statements is correct?**
- [ ] The address 10.18.19.127 is the subnet's broadcast address. 
- [ ] The subnet consists of 512 different addresses. 
- [ ] The subnet's prefix can be aggregated with the prefix 10.18.18.0/24 to the prefix 10.18.19.0/23. 
- [x] The adress 10.18.19.44 belongs to the subnet. 
 

**Question 4: Consider a large autonomous system with over 100 routers. You would like to be able to configure link costs to control the traffic flows inside the autonomous system. Which of the following protocols would be most suitable for routing inside this autonomous system?**

- [ ] Static routing would be more suitable in this case.
- [ ] OSPF 
- [ ] RIP 
- [x] BGP 
 
 
**Question 5: Assume an IP packet carrying a TCP segment is leaving your private network through your NAT (Network Address Translation) box on its way to a public server on the Internet. Which of the following statements about this packet is most correct?**

- [ ] The source address will be replaced with a temporary public IP address and the source port number will be replaced with a new number. 
- [ ] The source address will be replaced with a temporary public IP address and the source port number will remain unchanged. 
- [x] The source address will be replaced with your public IP address and the source port number will be replaced with a new number. 
- [ ] The source address will be replaced with your public IP address and the source port number will remain unchanged. 
 

**Question 6: MAC addresses (or link-layer addresses ) are used at the link layer to identify devices. Which of the following statements about link layer addressing  is false?**

- [ ] MAC addresses are assigned to network interfaces, so a device with multiple network interfaces has multiple MAC addresses. 
- [ ] The MAC adress space is flat (non-hierarchical) and MAC addresses are unique, which makes it possible to move a device between networks without reconfiguration. 
- [x] MAC addresses are organized hierarchically. A bit-mask (network mask) determines what addresses are present on a network. 
- [ ] MAC addresses are permanent, assigned by the manufacturer. They will not change if a device is moved. 


**Question 7: Eight bits of data are transmitted over a link where bit errors are likely to occur. The transmission is protected by an additional parity bit for error detection, where the error detection algorithm is even parity. Consider the transmission of the eight data bits "1111 0101". The additional parity bit is transfered after the eight data bits, so nine bits are transferred in total. During the transmission, an error occurs affecting one or more bits. Which of the following erroneous transmissions would be detected by the receiver, if the receiver gets the following nine bits (the last bit is the parity bit)?**

- [ ] 1101 1111 1 
- [ ] 0111 0101 1 
- [ ] 1101 0001 0 
- [x] 1110 0101 0 
 

**Question 8: Consider the network in the figure below with six computers (A–F) and three switches (S1–S3). Suppose that computer D sends a message to computer A, which responds with a message back to D. After that, computer B sends a message to computer C. Assuming that all address tables initially are empty, what MAC addresses will be in the address table of switch S3?**

- [ ] A, D 
- [x] B, D 
- [ ] A, B, C 
- [ ] A, B, D 
 

**Question 9: Consider the following network consisting of four computers, two switches, and one router. The computer with IP address 192.32.120.12 sends an IP packet with a request to the computer with IP address 130.237.9.93, which sends back an IP packet with a response. After the transaction, which IP address(es) can be found in the ARP table of the computer with IP address 192.32.120.12? Assume that the ARP table was empty before the transaction.**

- [ ] 192.32.120.1 and 130.237.9.93 
- [ ] 192.32.120.1, 130.237.9.1, and 192.237.9.93 
- [x] 192.32.120.1 
- [ ] 130.237.9.93 
 

**Question 10: CSMA (Carrier Sense Multiple Access) is a principle for medium access. CSMA/CA and CSMA/CD are two variants of CSMA, where "CA" stands for "Collision Avoidance" and "CD" for "Collision Detection". Which of the statements below is false?**

- [ ] When a device in a CSMA-based network wants to transmit data, it will first listen to see if someone else is sending.
- [ ] In a wireless network, a node's own transmitter is so strong that it is difficult to hear other transmitters. This is one of the reasons why wireless networks do not used CSMA/CD. 
- [ ] CSMA/CD relies on the assumption that every node can detect traffic between any other nodes. 
- [x] For CSMA/CD to work, there is a certain maximum size for frames. CSMA/CA does not have such a limitation.