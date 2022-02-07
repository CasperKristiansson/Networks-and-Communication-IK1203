# Lecture 4 - Socket Programming

- Two socket types for two transport services:
    - TCP: reliable, byte stream oriented, TCP responsible for dividing the stream into packets
    - UDP: unreliable, byte blok oriented (datagram), Application responsible for diving data into packets

## Socket Programming with TCP
- CLient open a **TCP connection** to a server
- TCP connection
    - Ordered delivery of data as a stream of bytes, bytes delivered in the same order they are sent
    - **Reliable**: if the data does not make it to the other side the application will learn about it
    - Bi-directional: both sides can send and receive data
- When the communication is complete, the client closes the connection
    - Both client and server may take initiative to close connection (**FIN flag**)
    - The two directions are closed independently and therefore a connection might be half open

## Encoding / Decoding
- **Encoding**: converting data into a format that can be sent over the network
- **Decoding**: converting data received from the network into a format that can be used by the application

Its important to define the encoding and decoding process ASCII (American Standard Code for Information Interchange), UTF-8, UTF-16, UTF-32, ISO 8859-1...

