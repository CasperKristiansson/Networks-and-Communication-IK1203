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
