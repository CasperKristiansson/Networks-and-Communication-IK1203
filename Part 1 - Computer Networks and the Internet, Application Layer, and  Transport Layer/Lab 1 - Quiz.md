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

- Connects to the end user (home, company, university, etc) -> Acess ISP
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
