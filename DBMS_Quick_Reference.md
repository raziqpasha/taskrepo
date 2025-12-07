# DBMS MCQ - Quick Reference Cheat Sheet 🚀

## ⚡ ULTRA-QUICK MEMORY TRICKS

### 1. DATABASE BASICS
- **Database** = Organized + Related + No redundancy
- **DBMS** = Bridge (Users ↔ DBMS ↔ Data)
- **3 Levels** = **E-L-P** (External-Logical-Physical)
  - External = What users see
  - Logical = What data exists
  - Physical = How stored
- **View** = Simplified + User-specific
- **Data Dictionary** = Metadata repository

### 2. KEYS & CONSTRAINTS
- **Super Key** = Unique (may have extra)
- **Candidate Key** = Minimal Super Key
- **Primary Key** = Unique + NOT NULL
- **Foreign Key** = References another table
- **UNIQUE** = Unique + NULL allowed
- **Entity Integrity** = Primary Key ≠ NULL
- **Referential Integrity** = Foreign Key valid

### 3. SQL COMMANDS
**4 Types: DDL, DML, DCL, TCL** (NO DSL!)

- **DDL** (Define): CREATE, ALTER, DROP
- **DML** (Manipulate): SELECT, INSERT, UPDATE, DELETE
- **DCL** (Control): GRANT, REVOKE
- **TCL** (Transaction): COMMIT, ROLLBACK

**Key Commands:**
- **DISTINCT** = Remove duplicates
- **WHERE** = Filter rows (before GROUP BY)
- **HAVING** = Filter groups (after GROUP BY)
- **LIKE** = Pattern matching (% = many, _ = one)
- **IS NULL** = Check NULL (NOT = NULL)
- **TRUNCATE** = Fast delete (DDL)
- **DROP** = Remove everything (DDL)
- **ALTER** = Change structure (DDL)
- **VIEW** = Virtual table (no storage)

**Aggregate Functions:**
- COUNT(*) = All rows (including NULLs)
- COUNT(column) = Non-NULL only
- AVG, SUM, MAX, MIN

**Joins:**
- **Inner Join** = Matching only
- **Left Outer** = All left + Matching right
- **Cross Join** = M × N rows (Cartesian)
- **Natural Join** = Auto-match same names

### 4. INDEXING
- **Dense Index** = Every record (faster lookup)
- **Sparse Index** = Blocks only (smaller)
- **Primary Index** = Orders data file (one per table)
- **Secondary Index** = Non-ordering field (always dense)
- **Clustered Index** = Physical order = Index order (one per table)
- **B+ Tree** = Standard (data pointers in leaves only)
- **B-Tree** = Data pointers everywhere
- **Multi-level** = Index on index (faster search)

**Trade-off:** Index = Fast SELECT, Slow INSERT/UPDATE/DELETE

### 5. NORMALIZATION
- **Lossless** = Join back = Original (no spurious tuples)
- **Dependency Preserving** = All FDs checkable locally
- **BCNF** = May lose dependencies
- **3NF** = Always dependency preserving
- **Chase Algorithm** = Test losslessness (n>2 tables)

### 6. TRANSACTIONS (ACID)
**A-C-I-D:**
- **A**tomicity = All or nothing
- **C**onsistency = Valid states
- **I**solation = Independent execution
- **D**urability = Permanent changes

**Transaction Operations:**
- **COMMIT** = Success (permanent)
- **ROLLBACK** = Failure (undo)

**Schedules:**
- **Serial** = One transaction at a time
- **Concurrent** = Interleaved operations
- **Serializable** = Equivalent to serial
- **2PL** = Growing (acquire) + Shrinking (release)
- **2PL Disadvantage** = Deadlocks

**Isolation Levels (low to high):**
1. Read Uncommitted
2. Read Committed
3. Repeatable Read
4. **Serializable** (prevents all anomalies)

**Recoverable** = Commit after dependencies
**Cascading Rollback** = Chain of rollbacks

### 7. RELATIONAL ALGEBRA
**5 Fundamental Operations:**
- σ (Selection) = Filter rows
- π (Projection) = Select columns
- U (Union) = Combine (no duplicates)
- × (Cartesian Product) = All combinations (M×N)
- ρ (Rename)

**Other Operations:**
- ∩ (Intersection) = Common tuples
- - (Difference) = R - S (only in R)
- ⨝ (Natural Join) = Match same names
- ÷ (Division) = "For all" queries

**Properties:**
- **Closure** = Relation in → Relation out
- **Associative** = × and ⨝ are associative
- **Procedural** = Must specify steps

**Union Compatible** = Same arity + Compatible domains

### 8. E-R MODEL
**Symbols:**
- **Rectangle** = Entity
- **Diamond** = Relationship
- **Oval** = Attribute
- **Double Rectangle** = Weak Entity
- **Double Diamond** = Identifying Relationship
- **Double Line** = Total Participation
- **Double Ellipse** = Multivalued Attribute
- **Dashed Ellipse** = Derived Attribute
- **Underline** = Key Attribute

**Relationships:**
- **1:1** = One to One
- **1:N** = One to Many
- **M:N** = Many to Many
- **Ternary** = 3 entities (n-ary if n>2)
- **Recursive** = Same entity both sides

**Participation:**
- **Total** = Every entity participates (double line)
- **Partial** = Some entities participate (single line)

**Attributes:**
- **Simple** = Atomic (cannot divide)
- **Composite** = Can divide (Street, City)
- **Multivalued** = Multiple values (separate table)
- **Derived** = Calculated (dashed)

**Weak Entity:**
- No primary key of own
- Partial key + Owner's primary key
- Identifying relationship = 1:N (owner to weak)

**Generalization/Specialization:**
- ISA hierarchy
- Inheritance principle
- Subclasses inherit from superclass

### 9. MAPPING E-R TO RELATIONAL
- **Entity** = Table
- **1:1 Relationship** = Foreign key in either table
- **1:N Relationship** = Foreign key on N-side
- **M:N Relationship** = Separate relationship table
- **Ternary/n-ary** = Separate relationship table
- **Weak Entity** = Composite primary key
- **Multivalued Attribute** = Separate table
- **Total Participation** = Foreign key required (NOT NULL)

---

## 🎯 COMMON EXAM PATTERNS

### Pattern 1: "What is..." Questions
- Look for definition keywords
- Eliminate wrong options first

### Pattern 2: "Which is NOT..." Questions
- Find the odd one out
- Usually one option doesn't fit the category

### Pattern 3: "What ensures..." Questions
- Usually about constraints or properties
- Match constraint to property

### Pattern 4: "When is..." Questions
- Condition-based questions
- Identify the condition

### Pattern 5: "Difference between..." Questions
- Compare two concepts
- Focus on distinguishing feature

---

## 🔥 LAST MINUTE REVIEW (5 MINUTES)

1. **ACID** = Atomicity, Consistency, Isolation, Durability
2. **3 Levels** = External, Logical, Physical
3. **4 SQL Types** = DDL, DML, DCL, TCL
4. **Index Trade-off** = Fast read, slow write
5. **2PL** = Growing + Shrinking phases
6. **B+ Tree** = Data pointers in leaves only
7. **Lossless** = Join back = Original
8. **Foreign Key** = References another table
9. **VIEW** = Virtual table (no storage)
10. **NULL** = Use IS NULL (not = NULL)

---

## 💡 MEMORY MNEMONICS

- **E-L-P** = External-Logical-Physical
- **A-C-I-D** = Atomicity-Consistency-Isolation-Durability
- **D-D-D-T** = DDL-DML-DCL-TCL
- **σ-π-U-×-ρ** = Selection-Projection-Union-Product-Rename
- **1-1-N-M-N** = 1:1, 1:N, M:N relationships

---

**Remember: Read questions carefully, eliminate wrong options, and trust your memory tricks!** 🎯
