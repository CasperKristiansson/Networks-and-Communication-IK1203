# Link Layer - Lecture 9

## Introduction - Goals, services
- Understand principles behind link layer services:
    - error detection and correction
    - sharing a broadcast channel: multiple access
    - Link layer addressing
    - Local area networks: Ethernet VLANs
- Instantiation and implementation of various link layer technologies

**Terminology**
- Hosts and routers: **nodes**
- Communication channels that connect adjacent nodes along communication path: **links**
- Layer-2 packet: **frame**

The link layer has the responsibility of transferring datagram from one node to physically adjacent node over a link.

### Link layer services
- Framing, link access:
    - Encapsulate datagram into frame
    - Channel access
    - MAC addresses used in frame headers to identify source and destination
- Reliable delivery between adjacent nodes
-Flow control
    - Pacing between adjacent sending and receiving nodes
- Error detection
    - Errors caused by signal attenuation, interference, or other factors


## 6.2 Error detection, correction
Error detection is not 100% reliable.
- Protocol may miss some errors, but rarely
- Larger EDC field yields better error detection and correction.

<img src="Images\ErrorDetection.png" height="250">


## 6.3 Multiple access protocols
- Multiple access link
    - A single link that many share
- Broadcast (shared wire or medium)
    - Old-fashioned Ethernet
    - Upstream HFC
- Only one can send at a time
- How coordinate sending
    - Multiple access protocol
- MAC
    - Multiple access protocol

Random access protocols allows each host to send packets when it needs to. Using this strategy will lead to collision.

- Channel partitioning
- Random access (Dynamic)
- Taking turns

