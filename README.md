<div align="center">

# 🏧 ATM Simulator — Java OOP Application

**Console-based ATM simulation with core banking operations, built with clean OOP design**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.java.com)
[![OOP](https://img.shields.io/badge/OOP-Design-blue?style=for-the-badge)](https://en.wikipedia.org/wiki/Object-oriented_programming)
[![Oasis Infobyte](https://img.shields.io/badge/Oasis%20Infobyte-Internship-green?style=for-the-badge)](https://oasisinfobyte.com)

</div>

---

## What This Is

A console-based ATM simulation built in Java, implementing core banking operations with clean object-oriented design. Built as Task 2 of the Oasis Infobyte Java Developer internship program.

---

## Features

| Operation | Description |
|---|---|
| 💳 PIN Validation | Authenticate with a 4-digit PIN before any transaction |
| 💰 Balance Inquiry | View current account balance |
| ⬆️ Deposit | Add funds to the account |
| ⬇️ Withdrawal | Withdraw with balance validation |
| 📋 Transaction History | View log of all past transactions |
| 🚪 Exit | Safely end the session |

---

## OOP Design

```
┌─────────────────────────────────────────┐
│              ATM (main class)            │
│  - Handles user interaction & session   │
└──────────────────┬──────────────────────┘
                   │ uses
┌──────────────────▼──────────────────────┐
│             Account                      │
│  - balance: double                       │
│  - pin: String                           │
│  - transactions: List<Transaction>       │
│  + deposit(), withdraw(), getBalance()  │
└──────────────────┬──────────────────────┘
                   │ creates
┌──────────────────▼──────────────────────┐
│            Transaction                   │
│  - type: String (DEPOSIT/WITHDRAWAL)    │
│  - amount: double                        │
│  - timestamp: LocalDateTime             │
└─────────────────────────────────────────┘
```

---

## Quickstart

```bash
# Clone
git clone https://github.com/sahilmulgund/OBISIP_JAVA_DEV_T2.git
cd OBISIP_JAVA_DEV_T2

# Compile
javac *.java

# Run
java ATM
```

---

## Sample Session

```
========== Welcome to ATM ==========
Enter PIN: ****
✓ PIN Verified

1. Check Balance
2. Deposit
3. Withdraw
4. Transaction History
5. Exit

> 1
Current Balance: ₹25,000.00

> 2
Enter deposit amount: 5000
✓ ₹5,000.00 deposited successfully
New Balance: ₹30,000.00
```

---

## Built During

**Oasis Infobyte Java Developer Internship** — Task 2 of 3  
Demonstrates: OOP design, encapsulation, separation of concerns, input validation, and console I/O in Java.

---

<div align="center">

Built by [Saheel Mulgund](https://github.com/sahilmulgund) · [LinkedIn](https://www.linkedin.com/in/saheelmulgund)

</div>
