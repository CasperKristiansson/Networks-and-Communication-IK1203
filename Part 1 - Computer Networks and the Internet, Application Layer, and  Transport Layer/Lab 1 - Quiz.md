# Quiz Answers

## 4. Lab 1 HTTP and mail protocols
**Question 1: Find the best matching description of the protocols.**

HTTP -> A stateless application-level protocol for distributed, collaborative, hypertext information systems.

SMTP -> A protocol for Internet electronic email transport.

POP3 -> A protocol that provide simple access to a mailbox (maildrop) maintained on a mail server.

IMAP -> A protocol that allows a client to access and manipulate electronic mail messages on a server.

**Question 2: Match the application layer protocols to the port numbers.**
HTTP -> 80

SMTP -> 25

POP3 -> 110

IMAP -> 143

HTTPS -> 443

IMAP over TLS/SSL -> 993

POP3 over TLS/SSL -> 995

E-mail message submission -> 587

## 6. Testing HTTP using telnet

**Question 5: The first digit of the Status code for HTTP responses defines the class of response. What do the different values defined for the first digit indicate?
HINT: See details of the Response Status Codes in the RFC7231.**

1xx - Informational
2xx - Successful
3xx - Redirection
4xx - Client Error
5xx - Server Error

**Question 6: Read RFC 7231 Section 6 and match the HTTP/1.1 response status codes to the correct descriptions.**

200 -> OK

301 -> Moved Permanently

401 -> Unauthorized

404 -> Not Found

500 -> Internal Server Error

502 -> Bad Gateway

503 -> Service Unavailable

302 -> Found

**Question 7: If you only want to test hypertext links for validity, accessibility, and recent information, it suffices to obtain meta information about the entity implied by the request without transferring the body itself. What is an alternative method that you can use for this instead of GET?
IMPORTANT: You must write only the method name in uppercase without any white spaces.**

HEAD