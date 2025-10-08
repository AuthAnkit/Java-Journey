#Java-Journey
Java Practice Questions & Solutions

This repository contains a collection of Java programming questions with detailed solutions.
The goal is to help students, beginners to practice Java concepts and improve their problem-solving skills.

Every code includes:
  Full question statement
  Java solution (code)
  Explanation (if required)



🎯 How to Use

Clone the repository:

git clone https://github.com/AuthAnkit/Java-Journey.git


Open any problem folder.

Read the Question.txt.

Try solving it yourself.

Check the Solution.java for reference.

📝 Contribution

Contributions are welcome! 🎉

If you have additional Java problems with solutions, feel free to create a pull request.

Make sure to follow the existing folder structure.

📌 Note

All problems are for practice & learning purposes.

If you are preparing for coding interviews, try solving the questions without looking at the solutions first.

⭐ Support

If you find this repository helpful, don’t forget to star 🌟 the repo and share it with others who are learning Java.

# Detect Nmap SYN scan
alert tcp any any -> $HOME_NET any (msg:"Nmap SYN Scan Detected"; flags:S; sid:1000001; rev:1;)

# Detect SSH connection attempt
alert tcp any any -> $HOME_NET 22 (msg:"SSH Connection Attempt"; flow:to_server,established; sid:1000002; rev:1;)

# Detect FTP anonymous login
alert tcp any any -> $HOME_NET 21 (msg:"FTP Anonymous Login"; content:"USER anonymous"; sid:1000003; rev:1;)

# Detect directory traversal in web requests
alert http any any -> $HOME_NET any (msg:"Directory Traversal Attempt"; content:"../"; sid:1000004; rev:1;)

# Detect SQL Injection attempt
alert http any any -> $HOME_NET any (msg:"SQL Injection"; content:"union select"; nocase; sid:1000005; rev:1;)

