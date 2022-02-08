# Quiz Answers
## Home Assignment 1 Quiz
**Question 1: Combine the following network access methods with the correct network technologies.**

- IEEE 802.11b/g/n -> Wireless local access
- Ethernet -> Wired local access
- ADSL -> Access over the fixed telephone network
- 3G, 4G (LTE) -> Access over mobile networks
- DOCSIS -> Access over cable tv networks

---

**Question 2: The questions is about the structure of the Internet. The Internet can be described as consisting of different kinds of organization, often companies, mainly Internet Service Providers (ISPs) and Internet Exchange Points (IXPs). We distinguish between to types of ISPs: Tier 1 ISPs and Access ISPs. Combine the descriptions below with the correct organization types:**

- Connects to the end user (home, company, university, etc) -> Access ISP
- Often has international coverage -> Tier 1 ISP
- A meetling place where ISPs connect to each other -> IXP
- Is usually a customer of one (or more) Tier 1 ISPs, and is being charged for sending and receiving traffic -> Access ISP
- Have mutual agreements for exchanging traffic with each other, free of charge ("peering agreements") -> Tier 1 ISP

---

**Question 3: Assume a simple model of the Internet with computers ("hosts"), switches ("routers") and links. For each layer in the Internet protocol stack, choose the description of its functionality that matches best. (When two devices are "directly connected", it means that there are no routers in between.)**

- Application layer -> Rules for communication between processes on different hosts that together make up an application.
- Transport layer -> Provides support for communication between processes on different hosts.
- Network layer -> Provides support for communication between hosts via nay routers in between.
- Link layer -> Provides support for communication between directly connected routers or hosts.
- Physical layer -> Defines for instance electrical and optical properties of a link

---

**Question 4: Combine the protocols below with the correct layer in the Internet protocol stack.**

- Application layer -> SMTP
- Transport layer -> TCP
- Network layer -> IP - Internet Protocol
- Link layer -> Ethernet

---

**Question 5: This question is about communication according to the client-server application architecture. Which of the following statements are correct about the client-server architecture?**

- [x] Clients do not communicate directly with each other.
- [ ] A client has a fixed address in the network. 
- [x] In practice, a server can consist of many computers that are reached at a common address.
- [ ] A server deals with only one client at a time.
- [x] A server has a fixed address in the network.

---

**Question 6: What statements are correct about communication according to the peer-to-peer application architecture (P2P)?**

- [ ] P2P networks are controlled by special servers, so called super nodes, which are owned and managed by the organization that controls the network.
- [x] A P2P network has no predefined structure. Instead, it is formed dynamically by the nodes ("peers") that for the moment are participating in the network (sharing a file, for instance).
- [ ] P2P networks are for distribution of copyright-protected material, and therefore illegal.
- [x] P2P networks rely on the principle that users make their resources available for sharing (resources for storage, communication, processing, etc).
- [ ] In a P2P network, there is no need for port numbers.

---

**Question 7: Consider the following statements about World Wide Web applications. What is true? (This question is about HTTP/1.1, as covered in the textbook and the lectures.)**

- [x] By using web caches it is possible to reduce the response time for client requests.
- [ ] HTTP is a "stateful" protocol, meaning that an HTTP server maintains "state" to keep track of the clients that are currently visiting the site.
- [x] HTTP is a text-based protocol (not binary), which means that HTTP requests and responses are transmitted in text format.
- [ ] HTTP is used to transfer HTML pages. Other types of web objects (such as images) are transmitted with FTP.
- [x] Each web object (page, image, movie, etc.) has a unique identifier that can be used to address the object.

---

**Question 8: You want to use your web browser to fetch a web page from a site called "www.wagstaff.info". Its web server is at TCP port 8080, and the page you are looking for is called "horse.html". Give the URL that you enter into the navigation field of your web browser.**

http://www.wagstaff.info:8080/horse.html or https://www.wagstaff.info:8080/horse.html

<br>
<br>
<br>

## Home Assignment 2

**Question 1: Which of the following statements about TCP are correct?**

- [x] The flow control used by TCP normally gives superior performance compared to stop-and-wait.
- [ ] All segments of a TCP connection will follow the same path through the network. 
- [ ] TCP and UDP will share the available bandwidth in fair manner. 
- [x] TCP includes mechanisms both for flow control and for congestion control. 
- [x] The retransmission timeout used by TCP depends partly on the distance between sender and receiver.
- [x] Before data can be transmitted, a connection has to be established.
- [ ] Assume we use TCP to transfer a file. If a segment in the middle is lost, TCP has to wait for a timeout before the segment can be retransmitted.
- [ ] TCP can guarantee that an application gets the bandwidth it requires.

---

**Question 2: Which of the following statements about DNS are true?**

- [x] A DNS server uses caching to be able to answer queries faster. 
- [x] Each organization, company, etc., that has a domain name is also responsible for answering DNS queries about its domain.
- [ ] A client that wants to do a DNS lookup sends its query to a root server.  
- [ ] DNS is a distributed database and therefore does not use the client-server model of communication.
- [x] An organization's local DNS server (or default name server) helps other computers within the organization to resolve DNS queries.
- [x] An authoritative DNS server knows the answers to queries about names in the domain for which it is responsible ("kth.se", for example).

---

**Question 3: Which of the following statements about TCP congestion control are correct?**

- [ ] The congestion window always increases in size until there is a timeout at the sender. 
- [x] During the slow start phase, the congestion window increases exponentially in size. 
- [ ] Initially, the congestion window is 65535 bytes. 
- [ ] With fast retransmit and fast recovery retransmissions are made for each duplicate ACK.
- [x] During the congestion avoidance phase, the congestion window increases linearly in size.

---

**Question 4: Assume a reliable transport protocol of the same kind as described in the course book and the lectures (rdt 3.0 in the book), and that the protocol must work over a network where both bit errors and packet loss can occur. This protocol uses several mechanisms to detect and deal with the errors above, mainly timers, sequence numbers, checksums, and acknowledgements (ACKs).**

- [x] We can deal with packet loss through the use of sequence numbers, ACKs, and timers. Checksums are not needed.
- [ ] It is sufficient with checksums and ACKs to deal with bit errors (in data and ACKs). Neither sequence numbers nor timers are needed.
- [ ] We need checksums, ACKs, and timers to deal with bit errors (in data and ACKs). Sequence numbers are not needed.
- [ ] We can deal with packet loss using only sequence numbers and ACKs. Timers and checksums are not needed.
- [ ] We can deal with packet loss and duplicates using only ACKs and timers. Sequence numbers and checksums are not needed.
- [x] It is sufficient with checksums, ACKs, and sequence numbers to deal with bit errors (in data and ACKs). Timers are not needed.

---

**Question 5: TCP is connection oriented, which means that it has to deal with connection establishment and termination. Which of the following statements are true?**

- [x] When a TCP connection is being established, the very first segment sent is a TCP SYN segment.
- [x] When TCP closes a connection, it normally uses a 4-way handshake. 
- [ ] When a connections is closed in TCP, it has to be initiated by the same side that initiated the connection establishment.
- [ ] The initial sequence number selected by TCP is normally 0, but in some implementations it is 1.
- [ ] TCP's way of closing a connection makes it vulnerable to a denial-of service attack.

---

**Question 6: TCP and UDP are both transport layer protocols, but they operate very differently. Which of the following alternatives are correct?**

- [ ] The TCP checksum can be turned off through the API used (the socket API). 
- [x] UDP can protect data with a checksum, but does not always do that. 
- [x] A server supporting both TCP and UDP can use the same port number for communicating with one client over UDP and another client over TCP.
- [x] A UDP sender can "starve out" a TCP sender from the network. 
- [ ] A TCP-based server communicating with several clients in parallel is normally doing so over one single connection.

---

**Question 7: We have studied two different protocols for flow control: Go-Back-N and Stop-and-wait. Below is a list of properties. Choose the protocol(s) for which the property is valid.**

- Requires the sender to buffer multiple packets -> Go-Back-N
- Packet loss can require retransmission even of several correctly delivered packets -> Go-Back-N
- Use "cumulative ACKs" -> Go-Back-N
- Normally gives lowest utilization of available network capacity -> Stop-and-Wait
- Two sequence numbers are sufficient -> Stop-and-Wait

---

**Question 8: Assume we have a transport level connection with a capacity of 8 Mbit/s and that the delay between sender and receiver is 5 ms (one-way). Which is the optimal window size in bytes that the sender should use? Hint: calculate the bandwidth-delay product. Answer in number of bytes (not kB, not bits). Give only the value without units as your answer.**

Optimal window size = capacity x RTT = 8 Mbit/s x 10 ms = 10000 bytes

***NOTE: 8 * 125000 x 0.01 = 10000***

---

**Question 9: DNS can be seen as a distributed database. What kind of lookup operations (or translations) are supported by DNS?**

- [x] Name to name 
- [x] Name to authoritative DNS server 
- [x] Name to IPv4 address 
- [x] Name to mail server 
- [x] Name to IPv6 address

---

**Question 10: Web cookies, or HTTP cookies, are used by many web servers, for different purposes. Which of the following statements about web cookies are true?**

- [ ] By examining a cookie in my web browser, I can determine what information the web server has about me.
- [x] By using cookies, a web server can keep track of when a user last visited the site. 
- [x] Cookies are created by the web server and stored in the web client. 
- [ ] Cookies are small programs that are executed in the web browser. 
- [x] By using cookies, web servers can for instance keep track of user-specific information, such as shopping baskets.
- [ ] A web server can ask to see all cookies that the web browser has.

---

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


<br>
<br>
<br>

## 4. Lab 1 HTTP and mail protocols
**Question 1: Find the best matching description of the protocols.**

- HTTP -> A stateless application-level protocol for distributed, collaborative, hypertext information systems.
- SMTP -> A protocol for Internet electronic email transport.
- POP3 -> A protocol that provide simple access to a mailbox (maildrop) maintained on a mail server.
- IMAP -> A protocol that allows a client to access and manipulate electronic mail messages on a server.

---

**Question 2: Match the application layer protocols to the port numbers.**

- HTTP -> 80
- SMTP -> 25
- POP3 -> 110
- IMAP -> 143
- HTTPS -> 443
- IMAP over TLS/SSL -> 993
- POP3 over TLS/SSL -> 995
- E-mail message submission -> 587

<br>
<br>
<br>

## 6. Testing HTTP using telnet

**Question 5: The first digit of the Status code for HTTP responses defines the class of response. What do the different values defined for the first digit indicate?
HINT: See details of the Response Status Codes in the RFC7231.**

- 1xx - Informational
- 2xx - Successful
- 3xx - Redirection
- 4xx - Client Error
- 5xx - Server Error

---

**Question 6: Read RFC 7231 Section 6 and match the HTTP/1.1 response status codes to the correct descriptions.**

- 200 -> OK
- 301 -> Moved Permanently
- 401 -> Unauthorized
- 404 -> Not Found
- 500 -> Internal Server Error
- 502 -> Bad Gateway
- 503 -> Service Unavailable
- 302 -> Found

---

**Question 7: If you only want to test hypertext links for validity, accessibility, and recent information, it suffices to obtain meta information about the entity implied by the request without transferring the body itself. What is an alternative method that you can use for this instead of GET?
IMPORTANT: You must write only the method name in uppercase without any white spaces.**

HEAD

<br>
<br>
<br>

## 13. Testing SMTP using OpenSSL

**Question 2: During the authentication, you should see that the mail server sends a message with a 334 reply. What does the response code 334 signify?**

- [ ] Redirection 
- [ ] Failed authentication 
- [ ] Client error 
- [ ] Successful authentication 
- [x] Server challenge 
- [ ] Server error

---

**Question 4: Read RFC 5321 section 4.1 (Links to an external site.) and match the SMTP commands.**

- HELO -> The sender introduces itself
- VRFY -> Check if name is a local user
- QUIT -> Instruct the SMTP server to close the connection
- RSET -> Clear the current mail transaction
- MAIL FROM -> Specify reverse-path (sender mailbox)
- RCPT TO -> Specify the recipient (destination mailbox)
- DATA -> Start of mail content

---

**Question 5: Read RFC 5321 Section 4.2 (Links to an external site.) and match the SMTP Reply Codes with their descriptions.**

- 220 -> Service Ready
- 250 -> Requested mail action okay, completed
- 421 -> Service not available
- 500 -> Syntax error, command unrecognized
- 503 -> Bad sequence of commands
- 554 -> Transaction failed
