# CSUS CSC 138 
## Programming Assignment #4 - Packet Scheduling problem 


### Objective:
Programming Assignment 4 – Router’s Packet Scheduling  
 
In computer networks, routers are responsible for forwarding the network packets to outgoing 
links. The incoming packets arrive at a router in sequence and are queued in the buffer of the 
router. The router needs to decide the order of packets to send to the outgoing link. This is 
called the packet scheduling problem.  
 
To simplify the problem, we assume the incoming packets are accumulated in the buffer and 
will be sent out in a batch when the buffer is full. We also assume the scheduling mechanism is 
priority scheduling. In priority scheduling, packets are divided into two categories, high priority 
packets and low priority packets (we use H to represent high priority and L to represent low 
priority). In a batch, high priority packets will be sent first. For packets with the same priority, 
they will be sent in the order of arrival. For example, given three incoming packets with priority 
of HLH respectively, the outgoing order of the packets should be 0, 2, 1. Here the packet 
number is assigned implicitly based on the packets' arrival order, starting from 0. The three 
incoming packets with priority of H, L, H will become packet 0, 1, 2 respectively.  
   
In this problem, we assume the buffer size is 3. Given the priority of a number of incoming 
packets, you need to print out the outgoing order of packets. For example, the three packets 
with priority of H, L, H will be output in the order of 0, 2, 1.   
 
If the number of packets n is not divisible by 3, the buffer is supposed to output the remaining 
n%3 packets instead of holding them. For example, five incoming packets have the priority of H, 
L, H, L, H respectively. The first three packets will arrive and make the buffer full, so they will be 
sent out in a batch in the order of 0, 2, 1. The remaining two packet will be sent in the order of 
4, 3. Therefore, the outgoing order of all packets should be 0, 2, 1, 4, 3. 
 
### Input of The Program 
The input of your program consists of an integer and a string. The integer is the number of 
incoming packets. The string is the priority for the incoming packets. The packet number is 
assigned implicitly based on the packets' arrival order, starting from 0. For example, input ``4 
HLHH'' represents that there are four incoming packets and the priority for packet 0, 1, 2, 3 are 
respectively H, L, H, H. 
 
### Output of The Program 
Given the input, you should print out the order of outgoing packets. For example, for input ``4 
HLHH'', the order of outgoing packets should be ``0 2 1 3''.  
 
Keep in mind that you need to check the correctness of input:  
If the priority of packets is not ``H'' or ``L'', then the output should be ``Wrong input: the 
priority must be H or L.''.  
If the number of packets is 0 or smaller than 0, then the output should be ``Wrong input: the 
number of packets must be greater than 0.''. 
If the length for priority string does not equal to the number of packets specified, then the 
output should be ``Wrong input: the number of packets is wrong.'' 
 
Example Input and Output of the Program: 
Sample 1: 
Input: 5 HLHLH 
Output: 0  2  1  4  3 
 
Sample 2:  
Input: 3 LHL 
Output: 1  0  2 
 
Deliverables: 
1. You should submit a program in a language you prefer: C, Java or Python. The template 
code for C is provided.  
a. The program should take 2 inputs: number of incoming packets, and the priority 
string for the incoming packets.  

b. The program’s output should match what is required in this assignment. For 
example, For example, for input “4” and “HLHH'', the order of outgoing packets 
should be ``0 2 1 3''.  

c. The grader will run your program and test your program with random input. 
Your program should pass all the test cases.  

2. You also need to submit a report with a screenshot of your code and screenshots of 
execution of the code. Be prepared to demonstrate your code to the grader or 
instructor. 
