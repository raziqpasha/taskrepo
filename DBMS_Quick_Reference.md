# DBMS QUICK REFERENCE CARD
## Last Minute Exam Review

---

## 🎯 THREE SCHEMA ARCHITECTURE

| Level | What It Is | Memory Trick |
|-------|------------|--------------|
| **External** | User's view (simplified) | "What user sees" |
| **Logical/Conceptual** | Structure & relationships | "What data is stored" |
| **Physical/Internal** | Storage details (files, indexes) | "How data is stored" |

**Independence:**
- **Logical Independence** = Conceptual changes don't affect External views
- **Physical Independence** = Physical changes don't affect Logical level

---

## 🔑 KEYS - QUICK COMPARISON

| Key Type | Definition | Memory Trick |
|----------|------------|--------------|
| **Super Key** | Unique (may have extra attributes) | "Super" = Bigger than needed |
| **Candidate Key** | Unique + Minimal | "Candidate" for Primary Key |
| **Primary Key** | Chosen Candidate Key | "Primary" = Main identifier |
| **Foreign Key** | References another table's PK | "Foreign" = From another table |

**Constraints:**
- **Entity Integrity** = Primary Key ≠ NULL
- **Referential Integrity** = Foreign Key must reference existing Primary Key

---

## 📊 INDEXES - AT A GLANCE

| Index Type | When Used | Always Dense? | Memory Trick |
|------------|-----------|---------------|--------------|
| **Primary** | On ordering key | Usually Sparse | "Primary" = Orders the file |
| **Secondary** | On non-ordering attribute | **Always Dense** | "Secondary" = Alternative path |
| **Dense** | Every record has entry | Yes | "Dense" = Every record |
| **Sparse** | Some records only | No | "Sparse" = Few entries (one per block) |
| **Clustered** | Physical order = Index order | Usually Sparse | "Clustered" = Data grouped by key |

**Rules:**
- One **Primary Index** per table (data sorted one way only)
- **Secondary Index** = Always dense (file not sorted by it)
- **B+ Tree** = Preferred (data pointers only in leaves, linked for range queries)

---

## 💾 SQL COMMAND TYPES

| Type | Commands | Purpose | Memory Trick |
|------|----------|---------|--------------|
| **DDL** | CREATE, ALTER, DROP | Define structure | "Definition" |
| **DML** | SELECT, INSERT, UPDATE, DELETE | Manipulate data | "Manipulation" |
| **DCL** | GRANT, REVOKE | Control access | "Control" |
| **TCL** | COMMIT, ROLLBACK | Manage transactions | "Transaction Control" |

**Key Differences:**
- **TRUNCATE** = Fast, removes all data, keeps structure (DDL)
- **DELETE** = Slow, removes rows with condition (DML)
- **DROP** = Removes entire table (DDL)

---

## 🔒 CONSTRAINTS

| Constraint | Purpose | Memory Trick |
|------------|---------|--------------|
| **PRIMARY KEY** | Unique + NOT NULL | "Primary" identifier |
| **UNIQUE** | Unique values (allows NULL) | "Unique" but can be NULL |
| **FOREIGN KEY** | References another table | "Links" tables |
| **CHECK** | Condition on values | "Checks" condition (e.g., Age > 18) |
| **NOT NULL** | Cannot be NULL | "Must have value" |

---

## 🔄 JOINS - QUICK GUIDE

| Join Type | Result | Memory Trick |
|-----------|--------|--------------|
| **Inner Join** | Only matching rows | "Inner" = Common only |
| **Left Outer** | All left + matching right (NULL if no match) | "Left" = Keep all left |
| **Right Outer** | All right + matching left (NULL if no match) | "Right" = Keep all right |
| **Full Outer** | All from both (NULL if no match) | "Full" = Keep all |
| **Cross Join** | M × N rows (Cartesian Product) | "Cross" = Every with every |

**Natural Join** = Automatic join on common attribute names

---

## ⚡ ACID PROPERTIES

| Property | What It Does | Memory Trick |
|----------|--------------|--------------|
| **Atomicity** | All or nothing | "Atomic" = Indivisible |
| **Consistency** | Valid state → Valid state | "Consistent" = Rules followed |
| **Isolation** | Transactions don't interfere | "Isolated" = Independent |
| **Durability** | Committed changes permanent | "Durable" = Survives crashes |

**Transaction Operations:**
- **COMMIT** = Save permanently
- **ROLLBACK** = Undo changes

---

## 📐 RELATIONAL ALGEBRA SYMBOLS

| Symbol | Operation | SQL Equivalent | Memory Trick |
|--------|-----------|----------------|--------------|
| **σ** | Selection (filter rows) | WHERE | "Sigma" = Select rows |
| **π** | Projection (select columns) | SELECT | "Pi" = Project columns |
| **∪** | Union (combine) | UNION | "U" = Union |
| **∩** | Intersection (common) | INTERSECT | "∩" = Common |
| **-** | Difference (subtract) | EXCEPT | "-" = Subtract |
| **×** | Cartesian Product | CROSS JOIN | "×" = Every with every |
| **⋈** | Natural Join | NATURAL JOIN | "⋈" = Join on common |

**Properties:**
- **Closed** = Result is always a relation
- **Procedural** = Specifies how (steps)
- **Associative** = (R op S) op T = R op (S op T) [for × and ⋈]

---

## 🎨 E-R MODEL SYMBOLS

| Symbol | Represents | Memory Trick |
|--------|------------|--------------|
| **Rectangle** | Entity Type | "Entity" = Rectangle |
| **Diamond** | Relationship Type | "Relationship" = Diamond |
| **Oval** | Attribute | "Attribute" = Oval |
| **Single Underline** | Primary Key | "Key" = Underline |
| **Double Underline** | Partial Key (Weak Entity) | "Partial" = Double |
| **Double Ellipse** | Multivalued Attribute | "Multiple" = Double |
| **Dashed Ellipse** | Derived Attribute | "Derived" = Dashed |

**Cardinality:**
- **1:1** = One to One
- **1:N** = One to Many
- **M:N** = Many to Many

**Participation:**
- **Total** = Double line (all must participate)
- **Partial** = Single line (some may not)

---

## 🔄 NORMALIZATION

| Normal Form | Requirement | Memory Trick |
|-------------|-------------|--------------|
| **1NF** | Atomic values (no multivalued) | "1" = Atomic |
| **2NF** | 1NF + No partial dependency | "2" = Full dependency |
| **3NF** | 2NF + No transitive dependency | "3" = No indirect dependency |
| **BCNF** | 3NF + Every determinant is candidate key | "BC" = Boyce-Codd |

**Trade-off:**
- **3NF** = Always lossless + dependency preserving
- **BCNF** = Always lossless (may lose dependencies)

---

## 🔐 CONCURRENCY CONTROL

| Concept | Definition | Memory Trick |
|---------|------------|--------------|
| **Serial Schedule** | One transaction at a time | "Serial" = Sequential |
| **Concurrent Schedule** | Operations interleaved | "Concurrent" = Mixed |
| **Serializable** | Same result as serial | "Serializable" = Equivalent to serial |
| **2PL** | Growing phase (acquire) + Shrinking phase (release) | "2 Phase" = Acquire then release |
| **Deadlock** | Circular wait for locks | "Dead" = Stuck |

**Isolation Levels (lowest to highest):**
1. Read Uncommitted
2. Read Committed
3. Repeatable Read
4. **Serializable** (prevents all anomalies)

---

## 🎯 COMMON PATTERNS TO REMEMBER

### Pattern 1: Index Selection
- **File ordered by key?** → Primary Index (usually Sparse)
- **File NOT ordered by key?** → Must use Dense Index
- **Non-key attribute?** → Secondary Index (always Dense)

### Pattern 2: Join Selection
- **Need all matching?** → Inner Join
- **Need all from left?** → Left Outer Join
- **Need all combinations?** → Cross Join

### Pattern 3: Constraint Selection
- **Unique identifier?** → PRIMARY KEY
- **Unique but can be NULL?** → UNIQUE
- **Links to another table?** → FOREIGN KEY
- **Value restriction?** → CHECK

### Pattern 4: Transaction Properties
- **All succeed or all fail?** → Atomicity
- **Valid state maintained?** → Consistency
- **No interference?** → Isolation
- **Survives crash?** → Durability

---

## 🚀 EXAM STRATEGY

1. **Read question carefully** - Identify what it's asking
2. **Eliminate wrong answers** - Use memory tricks
3. **Check keywords** - "Always", "Never", "Must" = Strong statements
4. **Remember patterns** - Use quick reference above
5. **Trust first instinct** - Don't overthink

---

## 💡 MEMORY MNEMONICS

- **ACID** = All-or-nothing, Consistent, Independent, Durable
- **DDL/DML/DCL/TCL** = Define, Manipulate, Control, Transaction
- **B+ Tree** = Better than B-Tree (data only in leaves, linked)
- **3NF vs BCNF** = 3NF Safe, BCNF May lose dependencies
- **Primary vs Secondary** = Primary orders, Secondary alternative
- **Dense vs Sparse** = Dense every record, Sparse some records

---

**GOOD LUCK! 🎯📚**
