# DBMS MCQ - Easy Learning Guide 🎯

## 📚 How to Use This Guide
- **Bold** = Key concept to remember
- 💡 = Memory trick
- ⚡ = Quick fact
- 🔑 = Important for exams

---

## 1. DATABASE BASICS

### Q1: What is a Database?
**Simplified:** What best describes a database?

**Choices:**
- (a) Application programs
- (b) **Structured collection of related data** ✅
- (c) Programming interface
- (d) Real-time transaction system

**💡 Memory Trick:** Database = **Data** + **Base** (foundation)
- Think: Organized filing cabinet with related files
- **NOT** programs, **NOT** just storage - it's ORGANIZED data

**🔑 Key Point:** Database = Organized + Related + No redundancy

---

### Q2: Primary Function of DBMS
**Simplified:** What is the main job of DBMS?

**Choices:**
- (a) Manage hardware
- (b) **Interface between users and data** ✅
- (c) Execute algorithms
- (d) Enforce security at app level

**💡 Memory Trick:** DBMS = **Bridge**
- Users ←→ DBMS ←→ Data
- Provides tools: DDL (define), DML (manipulate)

**🔑 Key Point:** DBMS = Middleman + Tools provider

---

### Q3: Physical Level of Abstraction
**Simplified:** Which level shows HOW data is stored on disk?

**Choices:**
- (a) External Level
- (b) Logical Level
- (c) **Physical Level** ✅
- (d) Abstraction Level

**💡 Memory Trick:** **3 Levels = E-L-P**
- **E**xternal = What users see (Views)
- **L**ogical = What data exists (Structure)
- **P**hysical = How stored (Disk, files, indexes)

**🔑 Key Point:** Physical = Storage details (files, blocks, indexes)

---

### Q4: Logical Level Concern
**Simplified:** What does Logical Level describe?

**Choices:**
- (a) Storage allocation
- (b) **Complete database structure** ✅
- (c) User-specific subset
- (d) Machine code

**💡 Memory Trick:** Logical = **Structure** (entities, attributes, relationships)
- Think: Blueprint of the building (not the bricks)

**🔑 Key Point:** Logical = WHAT data, not HOW stored

---

### Q5: External Level (View Level)
**Simplified:** What provides simplified, user-specific database view?

**Choices:**
- (a) Physical Schema
- (b) Internal Schema
- (c) Conceptual Schema
- (d) **View (External Schema)** ✅

**💡 Memory Trick:** External = **View** = What user sees
- Hides complexity, shows only what user needs

**🔑 Key Point:** View = Simplified + User-specific + Hides sensitive data

---

### Q6: Logical Data Independence
**Simplified:** What ensures changes in Conceptual Schema don't affect External Views?

**Choices:**
- (a) Physical changes don't affect Logical
- (b) **Conceptual changes don't affect External** ✅
- (c) Storage media changes
- (d) DBMS independence

**💡 Memory Trick:** **Independence = Protection**
- Logical Data Independence = Conceptual ↔ External protection
- Physical Data Independence = Physical ↔ Logical protection

**🔑 Key Point:** Logical Independence = Schema changes don't break user views

---

### Q7: DBMS Characteristic NOT Primary Goal
**Simplified:** Which is NOT a main feature of DBMS?

**Choices:**
- (a) Data Redundancy Control ✅
- (b) Data Sharing ✅
- (c) Concurrent Access ✅
- (d) **Machine Language Programming** ❌

**💡 Memory Trick:** DBMS = **High-level** (SQL), NOT low-level (machine code)
- DBMS uses SQL (Structured Query Language), not assembly

**🔑 Key Point:** DBMS = High-level languages, NOT machine code

---

### Q8: Data Model Definition
**Simplified:** What does a data model describe?

**Choices:**
- (a) Physical storage devices
- (b) **Data, relationships, semantics, constraints** ✅
- (c) Operating system instructions
- (d) Application logic only

**💡 Memory Trick:** Data Model = **4 Things**
- **D**ata structure
- **R**elationships
- **S**emantics (meaning)
- **C**onstraints (rules)

**🔑 Key Point:** Data Model = Framework for describing database

---

### Q9: Super Key Definition
**Simplified:** What uniquely identifies every tuple (regardless of minimality)?

**Choices:**
- (a) Minimal unique set
- (b) **Any unique set (may not be minimal)** ✅
- (c) Refers to another table
- (d) Used for sorting

**💡 Memory Trick:** **Super Key = Super Set**
- Super Key = Can have extra attributes
- Candidate Key = Minimal Super Key
- Primary Key = Chosen Candidate Key

**🔑 Key Point:** Super Key = Unique (but may have extra attributes)

---

### Q10: Candidate Key
**Simplified:** {A,B} uniquely identifies all attributes, and no subset works. What is it?

**Choices:**
- (a) Foreign Key
- (b) Simple Key
- (c) **Candidate Key** ✅
- (d) Secondary Key

**💡 Memory Trick:** Candidate = **Minimal** + **Unique**
- Candidate Key = Can be chosen as Primary Key
- Must be minimal (no extra attributes)

**🔑 Key Point:** Candidate Key = Minimal Super Key

---

### Q11: Entity Integrity Constraint
**Simplified:** What ensures primary key cannot be NULL?

**Choices:**
- (a) Referential Integrity
- (b) **Entity Integrity** ✅
- (c) Domain Constraint
- (d) Key Constraint

**💡 Memory Trick:** **Entity = Row = Must have identity**
- Every row must be identifiable → Primary Key ≠ NULL

**🔑 Key Point:** Entity Integrity = Primary Key ≠ NULL

---

### Q12: Foreign Key Definition
**Simplified:** What references primary key of another table?

**Choices:**
- (a) Uniquely identifies tuple
- (b) **References primary/candidate key of another table** ✅
- (c) Must be distinct
- (d) Enforces domain constraints

**💡 Memory Trick:** Foreign Key = **Link** between tables
- Points to Primary Key in another table
- Creates relationship

**🔑 Key Point:** Foreign Key = Reference to another table's key

---

### Q13: Foreign Key Constraint Rule
**Simplified:** What ensures foreign key value exists in referenced table?

**Choices:**
- (a) Entity Integrity
- (b) Domain Integrity
- (c) **Referential Integrity** ✅
- (d) Constraint Integrity

**💡 Memory Trick:** **Referential = Reference must be valid**
- Foreign Key value must exist in referenced table
- Prevents orphan records

**🔑 Key Point:** Referential Integrity = Valid references only

---

### Q14: Foreign Key Example
**Simplified:** DeptID in EMPLOYEE refers to DID in DEPARTMENT. What is DeptID?

**Choices:**
- (a) Primary Key
- (b) Super Key
- (c) **Foreign Key** ✅
- (d) Secondary Key

**💡 Memory Trick:** **Foreign = From another table**
- DeptID is in EMPLOYEE but points to DEPARTMENT
- Creates link between tables

**🔑 Key Point:** Foreign Key = Attribute that references another table

---

### Q15: NULL in Foreign Key
**Simplified:** What does NULL in foreign key mean?

**Choices:**
- (a) Must match NULL in referenced table
- (b) Tuple is invalid
- (c) **Tuple doesn't participate in relationship** ✅
- (d) Entire relation inconsistent

**💡 Memory Trick:** NULL = **No relationship**
- NULL foreign key = Optional relationship
- Valid if foreign key not part of primary key

**🔑 Key Point:** NULL foreign key = No link (if allowed)

---

### Q16: Data Dictionary
**Simplified:** What stores schema definitions and constraints?

**Choices:**
- (a) Data Files
- (b) Index Structures
- (c) **Data Dictionary (Catalog)** ✅
- (d) Application Programs

**💡 Memory Trick:** Dictionary = **Metadata** (data about data)
- Stores: tables, columns, constraints, indexes
- Like a phone book for database structure

**🔑 Key Point:** Data Dictionary = Metadata repository

---

### Q17: Conceptual Schema
**Simplified:** What represents community view of entire database?

**Choices:**
- (a) External Schema
- (b) Internal Schema
- (c) **Conceptual Schema (Logical Level)** ✅
- (d) View Schema

**💡 Memory Trick:** Conceptual = **Community** view
- All users' combined view
- Bridge between physical and external

**🔑 Key Point:** Conceptual Schema = Global database structure

---

### Q18: Referential Integrity Term
**Simplified:** What ensures foreign key values reference valid primary keys?

**Choices:**
- (a) Domain Constraint
- (b) Key Constraint
- (c) Entity Integrity
- (d) **Referential Integrity** ✅

**💡 Memory Trick:** **Referential = Reference must exist**
- Foreign Key → Must point to existing Primary Key

**🔑 Key Point:** Referential Integrity = Valid foreign key references

---

## 2. NORMALIZATION & DECOMPOSITION

### Q19: Foreign Dependency Constraint
**Simplified:** What ensures foreign key values match existing primary keys?

**Choices:**
- (a) Domain Constraint
- (b) Key Constraint
- (c) Entity Integrity
- (d) **Referential Integrity** ✅

**💡 Memory Trick:** Same as Q18 - **Referential = Reference**

**🔑 Key Point:** Foreign Key constraint = Referential Integrity

---

### Q20: Lossless Join Decomposition Requirement
**Simplified:** What must be true for decomposition to be lossless?

**Choices:**
- (a) Union of FDs equivalent
- (b) **Natural join equals original relation** ✅
- (c) Intersection contains primary key
- (d) Size less than original

**💡 Memory Trick:** **Lossless = No data loss**
- Join decomposed tables = Get original table back
- No spurious (fake) tuples

**🔑 Key Point:** Lossless = R₁ ⨝ R₂ = R (original)

---

### Q21: Binary Decomposition Lossless Check
**Simplified:** When is binary decomposition lossless?

**Choices:**
- (a) Common attributes form superkey for R
- (b) **Common attributes form superkey for R₁ or R₂** ✅
- (c) R₁∩R₂ equals all attributes
- (d) All FDs in decomposed relations

**💡 Memory Trick:** **Common attributes = Key**
- Intersection (common) must be key of one relation
- Example: R₁(A,B), R₂(B,C) → B must be key of R₁ or R₂

**🔑 Key Point:** Lossless if common attributes = superkey

---

### Q22: Lossless Join Definition
**Simplified:** What does lossless join mean mathematically?

**Choices:**
- (a) Union of FDs equivalent
- (b) **Natural join equals original** ✅
- (c) Intersection has primary key
- (d) Decomposed size smaller

**💡 Memory Trick:** **Lossless = Reversible**
- Decompose → Join = Original (no data loss)

**🔑 Key Point:** Lossless = R₁ ⨝ R₂ ⨝ ... ⨝ Rₙ = R

---

### Q23: Dependency Preserving
**Simplified:** When is decomposition dependency preserving?

**Choices:**
- (a) Every FD in one relation
- (b) **Closure of projected FDs = Closure of original FDs** ✅
- (c) Set difference empty
- (d) Union equals original

**💡 Memory Trick:** **Dependency Preserving = All constraints checkable**
- Can check all FDs in decomposed tables
- (∪Fᵢ)⁺ = F⁺

**🔑 Key Point:** Dependency Preserving = All FDs enforceable locally

---

### Q24: BCNF vs 3NF Trade-off
**Simplified:** What's true about BCNF decomposition?

**Choices:**
- (a) Always lossless and dependency preserving
- (b) Always lossless, may lose dependencies ✅
- (c) Always dependency preserving, may be lossy
- (d) Necessary for 3NF

**💡 Memory Trick:** **BCNF = Stricter**
- BCNF: May lose dependency preservation
- 3NF: Always dependency preserving

**🔑 Key Point:** BCNF prioritizes eliminating redundancy, may lose FDs

---

### Q25: Why Lossless Join Important
**Simplified:** Why is lossless join crucial?

**Choices:**
- (a) Simplifies query optimization
- (b) Reduces storage
- (c) **Prevents spurious tuples** ✅
- (d) Enforces foreign keys

**💡 Memory Trick:** **Lossless = No fake data**
- Lossy = Join creates rows that never existed
- Lossless = Join recreates original exactly

**🔑 Key Point:** Lossless = Data integrity (no fake tuples)

---

### Q26: Chase Algorithm
**Simplified:** What tests if multi-table decomposition is lossless?

**Choices:**
- (a) Attribute Closure
- (b) Dependency Basis
- (c) **Chase Algorithm** ✅
- (d) Canonical Cover

**💡 Memory Trick:** **Chase = Check losslessness**
- Uses table construction and symbol equality
- Tests if decomposition is lossless

**🔑 Key Point:** Chase Algorithm = Losslessness test for n>2 tables

---

## 3. SQL BASICS

### Q27: SQL Full Form
**Simplified:** What does SQL stand for?

**Choices:**
- (a) Standard Query Language
- (b) Structured Question Language
- (c) Sequential Query Logic
- (d) **Structured Query Language** ✅

**💡 Memory Trick:** **SQL = Structured Query Language**
- S = Structured (organized)
- Q = Query (ask questions)
- L = Language

**🔑 Key Point:** SQL = Structured Query Language (official)

---

### Q28: SQL Command Types
**Simplified:** Which is NOT a SQL command type?

**Choices:**
- (a) DDL ✅
- (b) DCL ✅
- (c) **DSL** ❌
- (d) DML ✅

**💡 Memory Trick:** **4 Types: DDL, DML, DCL, TCL**
- **D**ata **D**efinition **L**anguage (CREATE, ALTER, DROP)
- **D**ata **M**anipulation **L**anguage (SELECT, INSERT, UPDATE, DELETE)
- **D**ata **C**ontrol **L**anguage (GRANT, REVOKE)
- **T**ransaction **C**ontrol **L**anguage (COMMIT, ROLLBACK)

**🔑 Key Point:** No DSL - only DDL, DML, DCL, TCL

---

### Q29: CREATE TABLE Category
**Simplified:** CREATE TABLE belongs to which category?

**Choices:**
- (a) DML
- (b) DCL
- (c) **DDL** ✅
- (d) TCL

**💡 Memory Trick:** **CREATE = Define structure = DDL**
- DDL = Define (CREATE, ALTER, DROP)
- DML = Manipulate data (SELECT, INSERT, UPDATE, DELETE)

**🔑 Key Point:** CREATE TABLE = DDL (defines structure)

---

### Q30: DROP TABLE Command
**Simplified:** What permanently removes table and all data?

**Choices:**
- (a) DELETE TABLE
- (b) REMOVE TABLE
- (c) **DROP TABLE** ✅
- (d) TRUNCATE TABLE

**💡 Memory Trick:** **DROP = Delete everything**
- DROP = Structure + Data + Constraints (all gone)
- DELETE = Data only (DML)
- TRUNCATE = Data only, faster (DDL)

**🔑 Key Point:** DROP TABLE = Remove table completely (DDL)

---

### Q31: ALTER TABLE Command
**Simplified:** What adds/modifies/drops columns?

**Choices:**
- (a) UPDATE TABLE
- (b) **ALTER TABLE** ✅
- (c) CHANGE TABLE
- (d) REDEFINE TABLE

**💡 Memory Trick:** **ALTER = Change structure**
- ALTER = Modify schema (DDL)
- UPDATE = Modify data (DML)

**🔑 Key Point:** ALTER TABLE = Change structure (DDL)

---

### Q32: UNIQUE Constraint
**Simplified:** What ensures unique values but allows NULL?

**Choices:**
- (a) PRIMARY KEY
- (b) **UNIQUE** ✅
- (c) NOT NULL
- (d) FOREIGN KEY

**💡 Memory Trick:** **UNIQUE vs PRIMARY KEY**
- UNIQUE = Unique + Allows NULL
- PRIMARY KEY = Unique + NOT NULL

**🔑 Key Point:** UNIQUE = Distinct values, NULL allowed

---

### Q33: FOREIGN KEY Constraint
**Simplified:** What links two tables enforcing referential integrity?

**Choices:**
- (a) PRIMARY KEY
- (b) CHECK
- (c) NOT NULL
- (d) **FOREIGN KEY** ✅

**💡 Memory Trick:** **FOREIGN KEY = Link**
- Creates relationship between tables
- Enforces referential integrity

**🔑 Key Point:** FOREIGN KEY = Table relationship + Referential integrity

---

### Q34: CHECK Constraint
**Simplified:** What restricts range of values in column?

**Choices:**
- (a) DOMAIN
- (b) **CHECK** ✅
- (c) RANGE
- (d) LIMIT

**💡 Memory Trick:** **CHECK = Condition**
- CHECK (Salary > 0)
- CHECK (Age BETWEEN 18 AND 65)

**🔑 Key Point:** CHECK = Boolean condition for values

---

### Q35: DISTINCT Keyword
**Simplified:** What eliminates duplicate rows?

**Choices:**
- (a) UNIQUE
- (b) TOP
- (c) **DISTINCT** ✅
- (d) SINGLE

**💡 Memory Trick:** **DISTINCT = Unique rows**
- SELECT DISTINCT column
- Removes duplicates from result

**🔑 Key Point:** DISTINCT = Remove duplicate rows

---

### Q36: HAVING Clause Requirement
**Simplified:** What clause is required with HAVING?

**Choices:**
- (a) WHERE
- (b) ORDER BY
- (c) **GROUP BY** ✅
- (d) FROM

**💡 Memory Trick:** **HAVING = Filter groups**
- HAVING filters after GROUP BY
- WHERE filters before GROUP BY

**🔑 Key Point:** HAVING requires GROUP BY

---

### Q37: AVG Function
**Simplified:** What returns average of numeric column?

**Choices:**
- (a) SUM
- (b) **AVG** ✅
- (c) MEAN
- (d) COUNT

**💡 Memory Trick:** **Aggregate Functions**
- AVG = Average
- SUM = Total
- COUNT = Count rows
- MAX/MIN = Maximum/Minimum

**🔑 Key Point:** AVG = Arithmetic mean

---

### Q38: WHERE vs HAVING
**Simplified:** What filters rows before grouping?

**Choices:**
- (a) GROUP BY
- (b) HAVING
- (c) **WHERE** ✅
- (d) ORDER BY

**💡 Memory Trick:** **WHERE → GROUP BY → HAVING**
- WHERE = Filter rows (before grouping)
- GROUP BY = Group rows
- HAVING = Filter groups (after grouping)

**🔑 Key Point:** WHERE = Row filter, HAVING = Group filter

---

### Q39: SQL Join Types
**Simplified:** Which is NOT a SQL join type?

**Choices:**
- (a) Inner Join ✅
- (b) Outer Join ✅
- (c) Cartesian Join ✅
- (d) **Parallel Join** ❌

**💡 Memory Trick:** **Join Types**
- Inner Join = Matching rows only
- Outer Join = Left/Right/Full (includes non-matching)
- Cross Join = Cartesian product
- Parallel Join = Execution strategy, not join type

**🔑 Key Point:** Parallel Join = Execution method, not SQL join type

---

### Q40: CROSS JOIN Result
**Simplified:** CROSS JOIN of M rows × N rows = ?

**Choices:**
- (a) M+N rows
- (b) **M×N rows** ✅
- (c) Min(M,N) rows
- (d) Only matching rows

**💡 Memory Trick:** **CROSS JOIN = Cartesian Product**
- Every row of Table1 × Every row of Table2
- M rows × N rows = M×N rows

**🔑 Key Point:** CROSS JOIN = All combinations (Cartesian product)

---

### Q41: COUNT(*) Function
**Simplified:** What counts all rows including NULLs?

**Choices:**
- (a) COUNT(column_name)
- (b) **COUNT(*)** ✅
- (c) COUNT(DISTINCT column_name)
- (d) COUNT(NULL)

**💡 Memory Trick:** **COUNT(*) vs COUNT(column)**
- COUNT(*) = All rows (including NULLs)
- COUNT(column) = Non-NULL values only

**🔑 Key Point:** COUNT(*) = Total rows (all, including NULLs)

---

### Q42: LIKE Operator
**Simplified:** What performs pattern matching?

**Choices:**
- (a) =
- (b) **LIKE** ✅
- (c) MATCH
- (d) IN

**💡 Memory Trick:** **LIKE = Pattern**
- LIKE '%pattern%' (contains)
- LIKE 'pattern%' (starts with)
- LIKE '%pattern' (ends with)
- % = zero or more characters
- _ = exactly one character

**🔑 Key Point:** LIKE = Wildcard pattern matching

---

### Q43: TRUNCATE TABLE
**Simplified:** What removes all rows but keeps structure (faster than DELETE)?

**Choices:**
- (a) DROP TABLE
- (b) DELETE FROM table_name
- (c) CLEAR TABLE
- (d) **TRUNCATE TABLE** ✅

**💡 Memory Trick:** **TRUNCATE vs DELETE**
- TRUNCATE = Fast, DDL, no logging, resets identity
- DELETE = Slow, DML, logged, can use WHERE

**🔑 Key Point:** TRUNCATE = Fast data removal (DDL)

---

### Q44: ORDER BY Default
**Simplified:** What's default ORDER BY when not specified?

**Choices:**
- (a) Descending (DESC)
- (b) Random (RAND)
- (c) **Ascending (ASC)** ✅
- (d) Reverse order

**💡 Memory Trick:** **ORDER BY = ASC by default**
- ORDER BY column = ASC (ascending)
- ORDER BY column DESC = Descending

**🔑 Key Point:** ORDER BY default = ASC (A-Z, 1-9)

---

### Q45: COMMIT Command
**Simplified:** What makes transaction changes permanent?

**Choices:**
- (a) SAVE
- (b) ROLLBACK
- (c) **COMMIT** ✅
- (d) FINALIZE

**💡 Memory Trick:** **COMMIT = Save permanently**
- COMMIT = Changes saved, transaction ends
- ROLLBACK = Undo changes, transaction ends

**🔑 Key Point:** COMMIT = Permanent save (TCL)

---

### Q46: ROLLBACK Command
**Simplified:** What undoes changes since last COMMIT?

**Choices:**
- (a) REVERT
- (b) UNDO
- (c) **ROLLBACK** ✅
- (d) RESTORE

**💡 Memory Trick:** **ROLLBACK = Undo**
- ROLLBACK = Cancel transaction, restore previous state

**🔑 Key Point:** ROLLBACK = Undo transaction (TCL)

---

### Q47: VIEW Definition
**Simplified:** What is a View?

**Choices:**
- (a) Physical copy of table
- (b) Transaction record
- (c) **Virtual table based on SELECT query** ✅
- (d) Stored procedure

**💡 Memory Trick:** **VIEW = Virtual table**
- View = Stored SELECT query
- No data stored, computed on demand
- Like a saved query

**🔑 Key Point:** VIEW = Virtual table (no physical storage)

---

### Q48: GRANT Command
**Simplified:** What gives user permission to access objects?

**Choices:**
- (a) AUTHORIZE
- (b) PERMIT
- (c) **GRANT** ✅
- (d) ASSIGN

**💡 Memory Trick:** **GRANT = Give permission**
- GRANT SELECT ON table TO user
- DCL command

**🔑 Key Point:** GRANT = Give privileges (DCL)

---

### Q49: REVOKE Command
**Simplified:** What removes previously granted permission?

**Choices:**
- (a) **REVOKE** ✅
- (b) DENY
- (c) REMOVE
- (d) RECALL

**💡 Memory Trick:** **REVOKE = Take back**
- REVOKE SELECT ON table FROM user
- Opposite of GRANT

**🔑 Key Point:** REVOKE = Remove privileges (DCL)

---

### Q50: NULL Meaning
**Simplified:** What does NULL mean?

**Choices:**
- (a) Zero (0)
- (b) Empty string ("")
- (c) **Unknown/missing/not applicable** ✅
- (d) Primary key violation

**💡 Memory Trick:** **NULL = Unknown**
- NULL ≠ 0 (zero is a value)
- NULL ≠ "" (empty string is a value)
- NULL = Absence of value

**🔑 Key Point:** NULL = Unknown/missing value

---

### Q51: IS NULL Operator
**Simplified:** How to check for NULL value?

**Choices:**
- (a) = NULL
- (b) **IS NULL** ✅
- (c) NULL CHECK
- (d) FIND NULL

**💡 Memory Trick:** **NULL requires special operator**
- Use: WHERE column IS NULL
- NOT: WHERE column = NULL (wrong!)

**🔑 Key Point:** Check NULL with IS NULL (not =)

---

### Q52: AS Keyword Purpose
**Simplified:** What does AS do in SELECT?

**Choices:**
- (a) Define data type
- (b) Specify ordering
- (c) **Provide alias (alternative name)** ✅
- (d) Convert file format

**💡 Memory Trick:** **AS = Alias**
- SELECT column AS alias
- SELECT column alias (AS optional)

**🔑 Key Point:** AS = Temporary name for column/table

---

### Q53: LIMIT Clause
**Simplified:** What returns only N rows from result?

**Choices:**
- (a) FIRST N
- (b) **LIMIT N (or TOP N)** ✅
- (c) MAX ROWS N
- (d) RETURN N

**💡 Memory Trick:** **LIMIT = Restrict rows**
- MySQL/PostgreSQL: LIMIT N
- SQL Server: TOP N

**🔑 Key Point:** LIMIT/TOP = Restrict number of rows

---

## 4. INDEXING

### Q54: Index Primary Purpose
**Simplified:** What's main purpose of indexes?

**Choices:**
- (a) Enforce constraints
- (b) Reduce storage
- (c) **Speed up data retrieval** ✅
- (d) Control concurrency

**💡 Memory Trick:** **Index = Fast lookup**
- Like book index - helps find pages quickly
- Reduces full table scan

**🔑 Key Point:** Index = Faster SELECT queries

---

### Q55: Dense Index
**Simplified:** What has index entry for every data record?

**Choices:**
- (a) Sparse Index
- (b) Primary Index
- (c) **Dense Index** ✅
- (d) Clustered Index

**💡 Memory Trick:** **Dense = Every record**
- Dense Index = Entry for every search key value
- Sparse Index = Entry for some values (blocks)

**🔑 Key Point:** Dense Index = One entry per record

---

### Q56: Sparse Index
**Simplified:** What has entries for only some records/blocks?

**Choices:**
- (a) Dense Index
- (b) Clustered Index
- (c) Secondary Index
- (d) **Sparse Index** ✅

**💡 Memory Trick:** **Sparse = Few entries**
- Typically one entry per block
- Requires sequential search within block

**🔑 Key Point:** Sparse Index = Fewer entries (blocks)

---

### Q57: Primary Index Search Key
**Simplified:** What is Primary Index built on?

**Choices:**
- (a) Primary Key (any)
- (b) Non-key attribute
- (c) **Primary Key, data file ordered on this key** ✅
- (d) Small data type

**💡 Memory Trick:** **Primary Index = Ordered file**
- Built on ordering key field
- Data file sorted on this key
- Usually Primary Key

**🔑 Key Point:** Primary Index = Ordered file + Ordering key

---

### Q58: Clustered Index Characteristic
**Simplified:** What's key feature of Clustered Index?

**Choices:**
- (a) Non-key unique attribute
- (b) Includes entire data record
- (c) **Physical order = Logical order** ✅
- (d) Multiple columns

**💡 Memory Trick:** **Clustered = Physical order**
- Data stored in same order as index
- Only one per table (data can only be sorted one way)

**🔑 Key Point:** Clustered Index = Dictates physical storage order

---

### Q59: Clustered Index Data Storage
**Simplified:** How is data stored with Clustered Index?

**Choices:**
- (a) Separate unordered file
- (b) **Physical order = Index order** ✅
- (c) Index contains primary key only
- (d) Data stored redundantly

**💡 Memory Trick:** **Clustered = Physical = Logical**
- Data rows stored in index key order
- Related data physically together

**🔑 Key Point:** Clustered = Data order matches index order

---

### Q60: Primary Indexes Count
**Simplified:** How many Primary Indexes per table?

**Choices:**
- (a) Zero
- (b) **Exactly one** ✅
- (c) Up to candidate keys
- (d) Unlimited

**💡 Memory Trick:** **Primary Index = One**
- Data file can only be sorted one way physically
- Usually clustered

**🔑 Key Point:** One Primary Index per table (physical ordering)

---

### Q61: Secondary Index
**Simplified:** What index is built on non-ordering attribute (always dense)?

**Choices:**
- (a) Primary Index
- (b) Clustered Index
- (c) **Secondary Index** ✅
- (d) Sparse Index

**💡 Memory Trick:** **Secondary = Alternative access**
- Built on any non-ordering attribute
- Always dense (need entry for every record)

**🔑 Key Point:** Secondary Index = Non-ordering attribute + Always dense

---

### Q62: Primary vs Secondary Index Difference
**Simplified:** Main difference between Primary and Secondary Index?

**Choices:**
- (a) Primary always unique
- (b) **Primary orders data file; Secondary doesn't** ✅
- (c) Primary dense, Secondary sparse
- (d) Primary on one field

**💡 Memory Trick:** **Primary = Orders data**
- Primary Index = Data file ordered on search key
- Secondary Index = Data file NOT ordered on search key

**🔑 Key Point:** Primary orders file; Secondary doesn't

---

### Q63: Multi-level Index Purpose
**Simplified:** Why use Multi-level Index?

**Choices:**
- (a) Handle multiple disks
- (b) Reduce leaf nodes
- (c) **Speed up searching large index** ✅
- (d) Enable different isolation levels

**💡 Memory Trick:** **Multi-level = Index on index**
- When index too large → Build index on index
- Reduces disk I/O for searching

**🔑 Key Point:** Multi-level Index = Faster search in large index

---

### Q64: Multi-level Index Structure
**Simplified:** What structure implements Multi-level Index?

**Choices:**
- (a) Hash Table
- (b) Linked List
- (c) **B-Tree or B+ Tree** ✅
- (d) Heap File

**💡 Memory Trick:** **B-Tree/B+ Tree = Hierarchical**
- Tree structure for multi-level indexing
- Balanced tree for efficient search

**🔑 Key Point:** B-Tree/B+ Tree = Multi-level index structure

---

### Q65: B-Tree Data Pointers Location
**Simplified:** Where are data pointers in B-Tree?

**Choices:**
- (a) Only leaf nodes
- (b) Only second level
- (c) **Root, internal, and leaf nodes** ✅
- (d) Only root

**💡 Memory Trick:** **B-Tree = Pointers everywhere**
- Data pointers can be in any node
- B+ Tree = Pointers only in leaves

**🔑 Key Point:** B-Tree = Data pointers in all nodes

---

### Q66: B+ Tree Preferred
**Simplified:** Why prefer B+ Tree for RDBMS?

**Choices:**
- (a) B-Tree
- (b) **B+ Tree** ✅
- (c) Hash Index
- (d) Multi-level Sequential

**💡 Memory Trick:** **B+ Tree = Better for databases**
- All data pointers in leaves (linked sequentially)
- Great for range queries
- Higher fan-out (more keys per node)

**🔑 Key Point:** B+ Tree = Standard for RDBMS (range queries)

---

### Q67: B+ Tree Data Pointers Location
**Simplified:** Where are data pointers in B+ Tree?

**Choices:**
- (a) Internal nodes
- (b) Root node
- (c) **Leaf nodes only** ✅
- (d) Index blocks

**💡 Memory Trick:** **B+ Tree = Leaves only**
- All data pointers in leaf nodes
- Leaves linked sequentially (range queries)

**🔑 Key Point:** B+ Tree = Data pointers only in leaves

---

### Q68: Unique Index
**Simplified:** Index on unique attribute is called?

**Choices:**
- (a) Non-Unique Index
- (b) **Unique Index** ✅
- (c) Clustered Index
- (d) Sparse Index

**💡 Memory Trick:** **Unique Index = Distinct values**
- Built on attribute with unique values
- Can be primary, secondary, dense, or sparse

**🔑 Key Point:** Unique Index = Distinct values guaranteed

---

### Q69: Index Disadvantage
**Simplified:** Major disadvantage of indexes?

**Choices:**
- (a) Slow down retrieval
- (b) Excessive memory
- (c) **Slow down INSERT/UPDATE/DELETE** ✅
- (d) Prevent foreign keys

**💡 Memory Trick:** **Index = Trade-off**
- Speeds up SELECT (read)
- Slows down INSERT/UPDATE/DELETE (write)
- Must update index when data changes

**🔑 Key Point:** Index = Fast reads, slow writes

---

### Q70: Fan-out Definition
**Simplified:** What is fan-out (branching factor)?

**Choices:**
- (a) Total leaf nodes
- (b) Minimum entries per node
- (c) **Maximum child pointers per node** ✅
- (d) Tree depth

**💡 Memory Trick:** **Fan-out = Branching**
- Maximum children per node
- Higher fan-out = Shorter tree = Fewer disk I/O

**🔑 Key Point:** Fan-out = Maximum children per node

---

### Q71: Dense Index Required When
**Simplified:** When is dense index mandatory?

**Choices:**
- (a) Unordered Index
- (b) **Dense Index** ✅
- (c) Hash Index
- (d) Block Index

**💡 Memory Trick:** **Unordered file = Dense required**
- If data file not ordered on index key → Must use dense
- Sparse won't work (can't guarantee record in block)

**🔑 Key Point:** Unordered file on index key → Dense index required

---

### Q72: Multi-level Index Bottom Level
**Simplified:** What is bottom-most level of Multi-level Index?

**Choices:**
- (a) Root index block
- (b) **Sparse index of data file** ✅
- (c) Actual data file
- (d) Clustered index

**💡 Memory Trick:** **Multi-level = Index on index**
- Bottom level = Original index (sparse index of data file)
- Upper levels = Indexes on lower levels

**🔑 Key Point:** Bottom level = Sparse index of data file

---

### Q73: B+ Tree Advantage
**Simplified:** Why B+ Tree better than B-Tree?

**Choices:**
- (a) Less memory
- (b) **Higher branching factor (fan-out)** ✅
- (c) Random data storage
- (d) Never needs rebalancing

**💡 Memory Trick:** **B+ Tree = More keys per node**
- Internal nodes = Keys only (no data pointers)
- More keys fit → Higher fan-out → Shorter tree

**🔑 Key Point:** B+ Tree = Higher fan-out = Fewer disk I/O

---

### Q124: Clustering Index
**Simplified:** Index where data order matches index order?

**Choices:**
- (a) Secondary Index
- (b) Multi-level Index
- (c) **Primary Index** ✅
- (d) Sparse Index

**💡 Memory Trick:** **Clustering = Physical order**
- Clustering Index = Data ordered on index key
- Primary Index usually clustering

**🔑 Key Point:** Clustering Index = Physical order = Index order

---

### Q125: Clustering Index on Non-key
**Simplified:** Can Clustering Index be on non-key field?

**Choices:**
- (a) True, allows grouping
- (b) False, must be primary key
- (c) **False, can be on any ordering field** ✅
- (d) True, only non-key

**💡 Memory Trick:** **Clustering = Any ordering field**
- Can be key or non-key
- Must be field used to physically order data

**🔑 Key Point:** Clustering Index = Any field that orders data

---

### Q126: Sparse Index Entry Creation
**Simplified:** When is sparse index entry created?

**Choices:**
- (a) Every record
- (b) Every non-NULL record
- (c) **First record in each block** ✅
- (d) Only primary key values

**💡 Memory Trick:** **Sparse = Block level**
- One entry per block (typically first record)
- Requires sequential search within block

**🔑 Key Point:** Sparse Index = One entry per block

---

### Q127: Dense Index Advantage
**Simplified:** Main advantage of Dense over Sparse Index?

**Choices:**
- (a) Reduced storage
- (b) Faster sequential scan
- (c) **Faster direct lookup** ✅
- (d) Better variable-length records

**💡 Memory Trick:** **Dense = Direct access**
- Can find exact record directly from index
- No sequential search needed

**🔑 Key Point:** Dense Index = Direct record location

---

### Q128: Secondary Index Field
**Simplified:** Secondary Index is on field that?

**Choices:**
- (a) Orders data file
- (b) **Not the ordering field** ✅
- (c) Guaranteed unique
- (d) Always requires sparse structure

**💡 Memory Trick:** **Secondary = Alternative**
- Not the primary ordering field
- Provides alternative access path

**🔑 Key Point:** Secondary Index = Non-ordering field

---

### Q129: Non-unique Secondary Index
**Simplified:** What structure needed for non-unique secondary index?

**Choices:**
- (a) Single pointer to first block
- (b) Sparse index entry
- (c) **List of pointers to all matching records** ✅
- (d) Pointer to primary key

**💡 Memory Trick:** **Non-unique = Multiple pointers**
- One key value → Multiple records
- Need list/bucket of pointers

**🔑 Key Point:** Non-unique index = Multiple pointers per key

---

### Q130: Multi-level Index Purpose
**Simplified:** Why use Multi-level Index?

**Choices:**
- (a) Increase indexed fields
- (b) **Reduce disk I/O for searching** ✅
- (c) Multiple physical orderings
- (d) Store variable-size records

**💡 Memory Trick:** **Multi-level = Faster search**
- Large index → Hard to search
- Multi-level → Hierarchical search → Fewer I/O

**🔑 Key Point:** Multi-level Index = Faster search in large index

---

### Q131: Index and Data File Ordering
**Simplified:** Which index order matches physical data order?

**Choices:**
- (a) Secondary Index always sparse
- (b) Primary Index only sparse
- (c) **Clustering Index only** ✅
- (d) Primary Index only dense

**💡 Memory Trick:** **Clustering = Physical order**
- Only Clustering Index matches physical order
- Other indexes = Logical order

**🔑 Key Point:** Clustering Index = Only one matching physical order

---

### Q132: Horizontal Fragmentation Requirements
**Simplified:** What must hold for distributed database fragmentation?

**Choices:**
- (a) Completeness, minimality, transparency
- (b) Completeness, minimality, replication
- (c) Replication, transparency, fragmentation
- (d) **Completeness, reconstruction, disjointness** ✅

**💡 Memory Trick:** **Fragmentation = 3 Rules**
- Completeness = All tuples included
- Reconstruction = Can join back to original
- Disjointness = No overlap

**🔑 Key Point:** Fragmentation = Complete + Reconstructible + Disjoint

---

### Q133: Selection Operator
**Simplified:** What does σ Age > 18 (Students) do?

**Choices:**
- (a) Removes Age column
- (b) **Keeps only tuples with Age > 18** ✅
- (c) Groups by age
- (d) Sorts by age

**💡 Memory Trick:** **σ = Selection = Filter rows**
- σ condition (Relation) = Rows satisfying condition

**🔑 Key Point:** Selection (σ) = Row filter

---

### Q134: Natural Join
**Simplified:** Natural join automatically?

**Choices:**
- (a) Removes duplicates
- (b) **Joins on matching attribute names** ✅
- (c) Joins by Cartesian product only
- (d) Requires foreign key

**💡 Memory Trick:** **Natural Join = Auto-match**
- Compares attributes with same name
- Joins on equal values

**🔑 Key Point:** Natural Join = Join on matching attribute names

---

### Q135: Dense Index Stores
**Simplified:** What stores all search key values at leaf level?

**Choices:**
- (a) Sparse Index
- (b) **Dense Index** ✅
- (c) Static Hash Index
- (d) Linear Index

**💡 Memory Trick:** **Dense = All values**
- One entry per search key value
- Efficient for equality search

**🔑 Key Point:** Dense Index = All search key values

---

### Q136: B+ Tree Property
**Simplified:** What's TRUE for B+ Trees?

**Choices:**
- (a) Data in internal nodes
- (b) **All leaves at same level** ✅
- (c) May become unbalanced
- (d) Traverse every node

**💡 Memory Trick:** **B+ Tree = Balanced**
- Height-balanced = All leaves same depth
- Self-balancing structure

**🔑 Key Point:** B+ Tree = Height-balanced (all leaves same level)

---

### Q137: ACID Properties
**Simplified:** Which is TRUE about ACID?

**Choices:**
- (a) Durability = Temporary
- (b) **Isolation prevents interference** ✅
- (c) Atomicity handled by indexes
- (d) Consistency optional

**💡 Memory Trick:** **ACID = 4 Properties**
- **A**tomicity = All or nothing
- **C**onsistency = Valid state transitions
- **I**solation = Independent execution
- **D**urability = Permanent changes

**🔑 Key Point:** Isolation = No interference between transactions

---

### Q138: Sparse Index Smaller
**Simplified:** Why is sparse index smaller than dense?

**Choices:**
- (a) **Stores subset of search-key values** ✅
- (b) Uses hashing
- (c) Stores only leaf entries
- (d) Stores only unique keys

**💡 Memory Trick:** **Sparse = Fewer entries**
- One entry per block vs one per record
- Naturally smaller

**🔑 Key Point:** Sparse Index = Fewer entries = Smaller

---

### Q139: Log Before Data Violation
**Simplified:** Writing data before logs violates what?

**Choices:**
- (a) **Atomicity** ✅
- (b) Isolation
- (c) Durability
- (d) Consistency

**💡 Memory Trick:** **Write-Ahead Logging (WAL)**
- Logs must be written before data
- Enables rollback (atomicity)
- Violation = Can't undo on crash

**🔑 Key Point:** Logs before data = Atomicity requirement

---

### Q140: Natural Join Requirements
**Simplified:** R(A,B) ⨝ S(B,C) requires?

**Choices:**
- (a) Always all combinations
- (b) **Matching domains for join attributes** ✅
- (c) Discards rows unless key constraints
- (d) Identical to R×S

**💡 Memory Trick:** **Natural Join = Compatible domains**
- Attributes with same name must have compatible types
- Joins on equal values

**🔑 Key Point:** Natural Join = Matching attribute names + Compatible domains

---

### Q141: Multilevel Index Memory
**Simplified:** Which index level must be in memory?

**Choices:**
- (a) All levels
- (b) Only lowest level
- (c) **Only highest level (root)** ✅
- (d) Only leaf pointers

**💡 Memory Trick:** **Root in memory**
- Search starts at root
- Must be in memory for fast access
- Other levels fetched as needed

**🔑 Key Point:** Root level = Must be in memory

---

### Q142: 1-N Relationship Total Participation
**Simplified:** Employee total participation in 1-N with Department means?

**Choices:**
- (a) Department references Employee
- (b) **Employee references Department** ✅
- (c) Both reference each other
- (d) Separate relationship table

**💡 Memory Trick:** **Total participation = Foreign key**
- Total participation on N-side → Foreign key on N-side
- Every Employee must have DeptID

**🔑 Key Point:** Total participation N-side = Foreign key on N-side

---

### Q143: Weak Entity Translation
**Simplified:** Weak entity OrderItem depends on Order. Translation?

**Choices:**
- (a) **Composite key (OrderID, ItemNo)** ✅
- (b) ItemNo only
- (c) Order stores ItemNo
- (d) Separate relationship table mandatory

**💡 Memory Trick:** **Weak entity = Composite key**
- Weak entity = Partial key + Owner's primary key
- OrderItem = (OrderID, ItemNo)

**🔑 Key Point:** Weak entity = Composite primary key

---

### Q144: Ternary Relationship
**Simplified:** Ternary relationship Student-Course-Instructor needs?

**Choices:**
- (a) Student and Course tables only
- (b) **Separate relationship table** ✅
- (c) Three binary relationships
- (d) Instructor in Course table

**💡 Memory Trick:** **Ternary = Separate table**
- n-ary relationship (n>2) → Separate relationship table
- Contains foreign keys to all participating entities

**🔑 Key Point:** Ternary relationship = Separate relationship table

---

## 5. TRANSACTIONS & CONCURRENCY

### Q105: Transaction Definition
**Simplified:** What is a Transaction?

**Choices:**
- (a) Single SQL query
- (b) Persistent record of changes
- (c) **Logical unit of work (all or nothing)** ✅
- (d) Process handling requests

**💡 Memory Trick:** **Transaction = Unit of work**
- Sequence of operations
- All succeed or all fail (atomicity)

**🔑 Key Point:** Transaction = Atomic unit of work

---

### Q106: Transaction Completion Operations
**Simplified:** What marks transaction completion?

**Choices:**
- (a) OPEN and CLOSE
- (b) READ and WRITE
- (c) START and FINISH
- (d) **COMMIT and ROLLBACK** ✅

**💡 Memory Trick:** **COMMIT vs ROLLBACK**
- COMMIT = Success, make changes permanent
- ROLLBACK = Failure, undo all changes

**🔑 Key Point:** COMMIT = Success, ROLLBACK = Failure

---

### Q107: Durability Property
**Simplified:** What guarantees committed changes survive crashes?

**Choices:**
- (a) Atomicity
- (b) Consistency
- (c) Isolation
- (d) **Durability** ✅

**💡 Memory Trick:** **Durability = Permanent**
- Once committed → Changes permanent
- Survives system failures

**🔑 Key Point:** Durability = Permanent changes

---

### Q108: Atomicity Property
**Simplified:** What does Atomicity ensure?

**Choices:**
- (a) Multiple transactions don't interfere
- (b) Database constraints preserved
- (c) **Transaction is all or nothing** ✅
- (d) Results permanent

**💡 Memory Trick:** **Atomicity = Indivisible**
- Either all operations succeed or all fail
- No partial execution

**🔑 Key Point:** Atomicity = All or nothing

---

### Q109: Consistency Property
**Simplified:** What does Consistency mean?

**Choices:**
- (a) Same data throughout
- (b) Always same speed
- (c) **Moves database from one valid state to another** ✅
- (d) Only one transaction active

**💡 Memory Trick:** **Consistency = Valid states**
- Database always in valid state
- Constraints always satisfied

**🔑 Key Point:** Consistency = Valid state transitions

---

### Q110: Isolation Property
**Simplified:** What does Isolation ensure?

**Choices:**
- (a) Only authorized access
- (b) Automatic locking
- (c) Transaction atomic
- (d) **Concurrent transactions execute independently** ✅

**💡 Memory Trick:** **Isolation = Independent**
- Transactions don't see each other's intermediate results
- As if running alone

**🔑 Key Point:** Isolation = Independent execution

---

### Q111: Schedule Definition
**Simplified:** What is a Schedule?

**Choices:**
- (a) Order transactions submitted
- (b) Sequence of log records
- (c) **Sequence of interleaved operations** ✅
- (d) Execution plan for query

**💡 Memory Trick:** **Schedule = Execution order**
- Order in which operations from multiple transactions execute
- Can be serial or concurrent

**🔑 Key Point:** Schedule = Order of operations execution

---

### Q112: Serial Schedule
**Simplified:** What is Serial Schedule?

**Choices:**
- (a) Transactions sequential, order changes
- (b) **All operations of one transaction complete before next starts** ✅
- (c) Interleaved only for reads
- (d) Leads to consistent state

**💡 Memory Trick:** **Serial = One at a time**
- Complete T1 → Then T2 → Then T3
- No interleaving

**🔑 Key Point:** Serial Schedule = No interleaving

---

### Q113: Concurrent Schedule
**Simplified:** What is Concurrent Schedule?

**Choices:**
- (a) All on different CPUs
- (b) Results in serializable state
- (c) **Operations interleaved in time** ✅
- (d) Only one transaction active

**💡 Memory Trick:** **Concurrent = Interleaved**
- Operations from different transactions mixed
- Better resource utilization

**🔑 Key Point:** Concurrent Schedule = Interleaved operations

---

### Q114: Serializable Schedule
**Simplified:** When is schedule Serializable?

**Choices:**
- (a) Only COMMIT/ROLLBACK
- (b) No deadlock
- (c) **Same result as some serial schedule** ✅
- (d) Uses two-phase locking

**💡 Memory Trick:** **Serializable = Equivalent to serial**
- Produces same result as some serial execution
- Correct concurrent execution

**🔑 Key Point:** Serializable = Equivalent to serial execution

---

### Q115: Two-Phase Locking (2PL)
**Simplified:** What does 2PL guarantee?

**Choices:**
- (a) Serializable ✅
- (b) Conflict-free
- (c) Free of deadlocks
- (d) Always non-interleaved

**💡 Memory Trick:** **2PL = Serializable**
- Guarantees conflict serializability
- Two phases: Growing (acquire locks) + Shrinking (release locks)

**🔑 Key Point:** 2PL = Guarantees serializable schedule

---

### Q116: 2PL Phases
**Simplified:** What are the two phases of 2PL?

**Choices:**
- (a) Read Phase and Write Phase
- (b) **Growing Phase and Shrinking Phase** ✅
- (c) Prepare Phase and Validation Phase
- (d) Lock Acquisition and Unlock Execution

**💡 Memory Trick:** **2PL = 2 Phases**
- Growing = Acquire locks (can't release)
- Shrinking = Release locks (can't acquire)

**🔑 Key Point:** 2PL = Growing (acquire) + Shrinking (release)

---

### Q117: 2PL Disadvantage
**Simplified:** Main disadvantage of 2PL?

**Choices:**
- (a) Deadlocks ✅
- (b) Starvation
- (c) Unrepeatable Reads
- (d) Loss of Durability

**💡 Memory Trick:** **2PL = Deadlock risk**
- Transactions waiting for each other's locks
- Need deadlock detection/prevention

**🔑 Key Point:** 2PL = May cause deadlocks

---

### Q118: Exclusive Lock Compatibility
**Simplified:** If T1 has Exclusive lock, what can T2 get?

**Choices:**
- (a) Shared lock
- (b) Exclusive lock
- (c) Update lock
- (d) **No lock (must wait)** ✅

**💡 Memory Trick:** **Exclusive = No sharing**
- X-lock conflicts with S-lock and X-lock
- Only one X-lock allowed

**🔑 Key Point:** Exclusive lock = No other locks allowed

---

### Q119: Cascading Rollback
**Simplified:** What is Cascading Rollback?

**Choices:**
- (a) Non-recoverable
- (b) Conflict Serializable
- (c) **Cascading Rollback** ✅
- (d) Non-isolated

**💡 Memory Trick:** **Cascading = Chain reaction**
- One rollback causes others to rollback
- T2 reads T1's uncommitted data → T1 rolls back → T2 must rollback

**🔑 Key Point:** Cascading Rollback = Chain of rollbacks

---

### Q120: Recoverable Schedule
**Simplified:** When is schedule Recoverable?

**Choices:**
- (a) Conflict serializable
- (b) Free of cascading rollbacks
- (c) **T commits only after all transactions that wrote data it read have committed** ✅
- (d) Uses crash-proof logging

**💡 Memory Trick:** **Recoverable = Safe commit order**
- Transaction commits only after transactions it depends on commit
- Prevents reading uncommitted data

**🔑 Key Point:** Recoverable = Commit after dependencies

---

### Q121: Precedence Graph Cycle
**Simplified:** Schedule NOT conflict serializable if graph has?

**Choices:**
- (a) Isolated node
- (b) Multiple edges
- (c) **Cycle** ✅
- (d) Exactly two nodes

**💡 Memory Trick:** **Cycle = Not serializable**
- Cycle = Circular dependency
- Can't order transactions → Not serializable

**🔑 Key Point:** Cycle in precedence graph = Not serializable

---

### Q122: Concurrent Schedule Benefit
**Simplified:** Benefit of concurrent over serial schedules?

**Choices:**
- (a) Guarantees consistency
- (b) Simplifies protocols
- (c) **Increases throughput** ✅
- (d) Ensures atomicity

**💡 Memory Trick:** **Concurrent = Better utilization**
- Overlaps I/O wait with CPU work
- More transactions per unit time

**🔑 Key Point:** Concurrent = Higher throughput

---

### Q123: Highest Isolation Level
**Simplified:** Highest isolation level preventing all anomalies?

**Choices:**
- (a) Read Committed
- (b) Repeatable Read
- (c) **Serializable** ✅
- (d) Read Uncommitted

**💡 Memory Trick:** **Isolation Levels (low to high)**
- Read Uncommitted (lowest)
- Read Committed
- Repeatable Read
- Serializable (highest, prevents all anomalies)

**🔑 Key Point:** Serializable = Highest isolation level

---

## 6. RELATIONAL ALGEBRA

### Q89: Selection Operation
**Simplified:** What selects subset of tuples satisfying condition?

**Choices:**
- (a) Projection
- (b) Union
- (c) **Selection (σ)** ✅
- (d) Cartesian product

**💡 Memory Trick:** **σ = Selection = Filter rows**
- σ condition (R) = Rows where condition true

**🔑 Key Point:** Selection (σ) = Row filter

---

### Q90: Projection Operation
**Simplified:** What eliminates columns (vertical subset)?

**Choices:**
- (a) Selection
- (b) Intersection
- (c) **Projection (π)** ✅
- (d) Difference

**💡 Memory Trick:** **π = Projection = Select columns**
- π columns (R) = Keep only specified columns

**🔑 Key Point:** Projection (π) = Column selector

---

### Q91: Fundamental Operations
**Simplified:** Minimal set of relational algebra operations?

**Choices:**
- (a) σ, π, U, X, K
- (b) **σ, π, U, X, ρ** ✅
- (c) σ, π, ∩, X, ρ
- (d) σ, π, -, X, K

**💡 Memory Trick:** **5 Fundamental Operations**
- σ (Selection)
- π (Projection)
- U (Union)
- × (Cartesian Product)
- ρ (Rename)

**🔑 Key Point:** 5 fundamental operations (all others derivable)

---

### Q92: Union Operation Result
**Simplified:** R ∪ S returns?

**Choices:**
- (a) All tuples in R or S with duplicates
- (b) Common tuples
- (c) **All tuples in R or S, duplicates eliminated** ✅
- (d) Tuples in R but not S

**💡 Memory Trick:** **Union = Combine, remove duplicates**
- All tuples from both relations
- Relations are sets (no duplicates)

**🔑 Key Point:** Union = All tuples from both (no duplicates)

---

### Q93: Union Compatibility
**Simplified:** Requirements for R and S to be union compatible?

**Choices:**
- (a) Same number of tuples
- (b) Same attributes
- (c) **Same number of attributes + Compatible domains** ✅
- (d) Common attribute

**💡 Memory Trick:** **Union Compatible = Same structure**
- Same arity (number of attributes)
- Corresponding attributes same domain

**🔑 Key Point:** Union compatible = Same arity + Compatible domains

---

### Q94: Natural Join Derivation
**Simplified:** Natural Join equivalent to?

**Choices:**
- (a) σ followed by π on R×S
- (b) π followed by R⨝S
- (c) **R×S followed by σ and π** ✅
- (d) R×S followed by σ only

**💡 Memory Trick:** **Natural Join = Cartesian + Filter + Project**
- R×S (all combinations)
- σ (keep matching)
- π (remove duplicate columns)

**🔑 Key Point:** Natural Join = Cartesian Product + Selection + Projection

---

### Q95: Set Difference
**Simplified:** What returns tuples in R but not S?

**Choices:**
- (a) Set Intersection
- (b) **Set Difference (R-S)** ✅
- (c) Division
- (d) Theta Join

**💡 Memory Trick:** **Difference = R - S**
- Tuples in R that are not in S
- Requires union compatibility

**🔑 Key Point:** Set Difference = R - S (tuples only in R)

---

### Q96: Theta Join vs Equijoin
**Simplified:** Difference between Theta Join and Equijoin?

**Choices:**
- (a) Theta includes all attributes
- (b) **Theta allows any comparison operator** ✅
- (c) Theta equivalent to Natural Join
- (d) Theta is outer join

**💡 Memory Trick:** **Theta Join = General**
- Theta Join = Any comparison (>, <, =, ≥, ≤, ≠)
- Equijoin = Only equality (=)

**🔑 Key Point:** Theta Join = General, Equijoin = Only equality

---

### Q97: Intersection Expression
**Simplified:** Expression equivalent to R ∩ S?

**Choices:**
- (a) **R - (R - S)** ✅
- (b) (R - S) ∪ (S - R)
- (c) R ∪ S - (R ∩ S)
- (d) R × S - σ condition

**💡 Memory Trick:** **Intersection = Difference of differences**
- R - (R - S) = Common elements
- Can derive from Set Difference

**🔑 Key Point:** Intersection derivable from Set Difference

---

### Q98: Left Outer Join
**Simplified:** Left Outer Join ensures?

**Choices:**
- (a) All tuples from both
- (b) All from right
- (c) **All from left, NULLs for unmatched** ✅
- (d) Only matching tuples

**💡 Memory Trick:** **Left Outer = Keep left**
- All tuples from left relation
- NULLs for attributes from right if no match

**🔑 Key Point:** Left Outer Join = All left tuples + Matching right

---

### Q99: Division Operation
**Simplified:** What returns tuples from R related to ALL tuples in S?

**Choices:**
- (a) Natural Join
- (b) Cartesian Product
- (c) **Division (÷)** ✅
- (d) Intersection

**💡 Memory Trick:** **Division = "For all"**
- R ÷ S = Tuples in R related to every tuple in S
- Example: Customers who bought ALL products

**🔑 Key Point:** Division = "For all" queries

---

### Q100: Cartesian Product Size
**Simplified:** R (M tuples) × S (N tuples) = ?

**Choices:**
- (a) M+N
- (b) **M×N** ✅
- (c) Min(M,N)
- (d) Max(M,N)

**💡 Memory Trick:** **Cartesian Product = Multiply**
- Every tuple of R × Every tuple of S
- M rows × N rows = M×N rows

**🔑 Key Point:** Cartesian Product = M × N tuples

---

### Q101: Set Theory Expression
**Simplified:** Which expression always true?

**Choices:**
- (a) R ∪ S = R ∩ S
- (b) R ∩ S = R - (R ∪ S)
- (c) **(R ∩ S) ⊆ (R ∪ S)** ✅
- (d) R × S = R ∪ S

**💡 Memory Trick:** **Intersection ⊆ Union**
- Common elements always subset of all elements
- Always true by set theory

**🔑 Key Point:** Intersection always subset of Union

---

### Q102: Relational Algebra Closure
**Simplified:** What does "closed" mean in relational algebra?

**Choices:**
- (a) Result always empty
- (b) Can't combine operations
- (c) **Input relation → Output relation** ✅
- (d) Must execute without errors

**💡 Memory Trick:** **Closure = Relation in, relation out**
- Operations take relations, produce relations
- Can chain operations

**🔑 Key Point:** Closure = Operations produce relations

---

### Q103: Associativity
**Simplified:** Which operations are associative?

**Choices:**
- (a) **Both Cartesian Product and Natural Join** ✅
- (b) Neither
- (c) Only Cartesian Product
- (d) Only Natural Join

**💡 Memory Trick:** **Both associative**
- (R × S) × T = R × (S × T)
- (R ⨝ S) ⨝ T = R ⨝ (S ⨝ T)
- Important for query optimization

**🔑 Key Point:** Both × and ⨝ are associative

---

### Q104: Procedural Language
**Simplified:** Why is relational algebra procedural?

**Choices:**
- (a) Specifies what, not how
- (b) **Requires specifying sequence of operations** ✅
- (c) Based on logic, not steps
- (d) Only operates on stored data

**💡 Memory Trick:** **Procedural = How to do**
- Must specify steps to get result
- Contrast: SQL is declarative (what you want)

**🔑 Key Point:** Relational Algebra = Procedural (how to compute)

---

## 7. E-R MODEL

### Q74: E-R Model Purpose
**Simplified:** What is E-R model's main purpose?

**Choices:**
- (a) Define physical storage
- (b) **High-level conceptual blueprint** ✅
- (c) Specify SQL queries
- (d) Enforce integrity

**💡 Memory Trick:** **E-R = Conceptual design**
- Entity-Relationship model
- High-level design before implementation

**🔑 Key Point:** E-R Model = Conceptual design tool

---

### Q75: Entity Type Symbol
**Simplified:** What represents Entity Type in E-R diagram?

**Choices:**
- (a) Oval/Ellipse
- (b) Diamond/Rhombus
- (c) **Rectangle/Square** ✅
- (d) Double Rectangle

**💡 Memory Trick:** **E-R Symbols**
- Rectangle = Entity
- Diamond = Relationship
- Oval = Attribute
- Double Rectangle = Weak Entity

**🔑 Key Point:** Rectangle = Entity Type

---

### Q76: Multivalued Attribute Symbol
**Simplified:** What represents multivalued attribute?

**Choices:**
- (a) Key Attribute
- (b) Composite Attribute
- (c) **Multivalued Attribute** ✅
- (d) Derived Attribute

**💡 Memory Trick:** **Attribute Symbols**
- Single ellipse = Simple attribute
- Double ellipse = Multivalued attribute
- Dashed ellipse = Derived attribute
- Underline = Key attribute

**🔑 Key Point:** Double ellipse = Multivalued attribute

---

### Q77: Cardinality Constraints
**Simplified:** Constraints defining min/max associations?

**Choices:**
- (a) Structural Constraints
- (b) Participation Constraints
- (c) **Cardinality Constraints** ✅
- (d) Domain Constraints

**💡 Memory Trick:** **Cardinality = Maximum**
- 1:1, 1:N, M:N
- Maximum number of associations

**🔑 Key Point:** Cardinality = Maximum associations (1:1, 1:N, M:N)

---

### Q78: Weak Entity Type
**Simplified:** What defines Weak Entity Type?

**Choices:**
- (a) Can't participate in relationships
- (b) No candidate keys
- (c) **No primary key of its own** ✅
- (d) Must be 1:1 relationship

**💡 Memory Trick:** **Weak Entity = Depends on strong**
- Weak Entity = Partial key + Owner's primary key
- Double rectangle in E-R diagram

**🔑 Key Point:** Weak Entity = No independent primary key

---

### Q79: Recursive Relationship
**Simplified:** Relationship where same entity type relates to itself?

**Choices:**
- (a) Ternary Relationship
- (b) Self-Referencing Relationship
- (c) **Recursive Relationship** ✅
- (d) Specialized Relationship

**💡 Memory Trick:** **Recursive = Self-reference**
- Employee supervises Employee
- Same entity type on both sides

**🔑 Key Point:** Recursive = Same entity type both sides

---

### Q80: Total Participation
**Simplified:** Every entity must participate in relationship?

**Choices:**
- (a) **Total Participation** ✅
- (b) Partial Participation
- (c) One-to-One Cardinality
- (d) Mandatory Referential Integrity

**💡 Memory Trick:** **Total = Mandatory**
- Total participation = Double line
- Every entity must participate

**🔑 Key Point:** Total Participation = Every entity participates (double line)

---

### Q81: 1:N Relationship Meaning
**Simplified:** What does 1:N mean?

**Choices:**
- (a) One in E₁ to at most one in E₂
- (b) Many in E₁, many in E₂
- (c) **One in E₁ to many in E₂, but E₂ to at most one in E₁** ✅
- (d) Must have total participation

**💡 Memory Trick:** **1:N = One to Many**
- One Department has many Employees
- One Employee belongs to one Department

**🔑 Key Point:** 1:N = One side to many side

---

### Q82: Ternary Relationship
**Simplified:** Relationship involving 3 entity types?

**Choices:**
- (a) Binary Relationship
- (b) Multiplicity Relationship
- (c) Hierarchical Relationship
- (d) **Ternary Relationship (n-ary)** ✅

**💡 Memory Trick:** **Ternary = 3 entities**
- Degree = Number of participating entities
- Ternary = Degree 3

**🔑 Key Point:** Ternary = 3 entity types (n-ary if n>2)

---

### Q83: Key Attribute Symbol
**Simplified:** What represents key attribute?

**Choices:**
- (a) **Key Attribute (Primary)** ✅
- (b) Partial Key
- (c) Multivalued Attribute
- (d) Identifying Attribute

**💡 Memory Trick:** **Key = Underline**
- Single underline = Primary key
- Double underline = Partial key (weak entity)

**🔑 Key Point:** Single underline = Key attribute

---

### Q84: Derived Attribute
**Simplified:** Age calculated from BirthDate is?

**Choices:**
- (a) Composite Attribute
- (b) **Derived Attribute** ✅
- (c) Multivalued Attribute
- (d) Stored Attribute

**💡 Memory Trick:** **Derived = Calculated**
- Derived = Computed from other attributes
- Dashed ellipse in E-R diagram

**🔑 Key Point:** Derived Attribute = Computed (dashed ellipse)

---

### Q85: Simple Attribute
**Simplified:** Which is simple (atomic) attribute?

**Choices:**
- (a) Street Address
- (b) Full_Address
- (c) **ZipCode** ✅
- (d) City_State

**💡 Memory Trick:** **Simple = Cannot be divided**
- Simple = Atomic (single value)
- Composite = Can be divided (Street, City, State)

**🔑 Key Point:** Simple Attribute = Atomic (cannot be subdivided)

---

### Q86: Generalization/Specialization Principle
**Simplified:** What principle do Generalization/Specialization use?

**Choices:**
- (a) Aggregation
- (b) Abstraction
- (c) **Inheritance** ✅
- (d) Modularity

**💡 Memory Trick:** **ISA = Inheritance**
- Generalization/Specialization = ISA hierarchy
- Subclasses inherit from superclass

**🔑 Key Point:** Generalization/Specialization = Inheritance (ISA)

---

### Q87: Weak Entity Identifying Relationship
**Simplified:** Relationship from Weak Entity to Identifying Entity is?

**Choices:**
- (a) 1:1
- (b) M:N
- (c) **1:N from identifying to weak** ✅
- (d) N:1 from identifying to weak

**💡 Memory Trick:** **Weak Entity = Many side**
- One owner → Many weak entities
- Double diamond = Identifying relationship

**🔑 Key Point:** Weak Entity relationship = 1:N (owner to weak)

---

### Q88: Multivalued Attribute Mapping
**Simplified:** What maps to separate table in relational schema?

**Choices:**
- (a) **Multivalued Attribute** ✅
- (b) 1:N Relationship
- (c) Total Participation
- (d) Simple Attribute

**💡 Memory Trick:** **Multivalued = Separate table**
- Violates 1NF (atomic values)
- Must create separate table

**🔑 Key Point:** Multivalued Attribute = Separate table

---

## 🎓 EXAM TIPS

### Quick Memory Tricks Summary:

1. **3 Levels of Abstraction:** E-L-P (External-Logical-Physical)
2. **SQL Command Types:** DDL, DML, DCL, TCL (4 types, no DSL)
3. **ACID Properties:** A-C-I-D (Atomicity-Consistency-Isolation-Durability)
4. **Index Types:** Dense (every record) vs Sparse (blocks)
5. **Join Types:** Inner, Outer (Left/Right/Full), Cross
6. **E-R Symbols:** Rectangle (Entity), Diamond (Relationship), Oval (Attribute)
7. **Relational Algebra:** σ (select), π (project), ⨝ (join), × (product)
8. **2PL Phases:** Growing (acquire) + Shrinking (release)
9. **Isolation Levels:** Read Uncommitted → Read Committed → Repeatable Read → Serializable

### Common Patterns:

- **Foreign Key** = References another table
- **Primary Key** = Unique + NOT NULL
- **UNIQUE** = Unique + NULL allowed
- **VIEW** = Virtual table (no storage)
- **INDEX** = Fast lookup (slow writes)
- **Transaction** = All or nothing
- **Serializable** = Equivalent to serial execution

---

## 📝 PRACTICE STRATEGY

1. **Learn the patterns** - Many questions follow similar patterns
2. **Focus on key concepts** - ACID, Normalization, Indexing, SQL
3. **Use memory tricks** - Create your own mnemonics
4. **Practice with examples** - Apply concepts to real scenarios
5. **Review regularly** - Spaced repetition helps retention

---

**Good Luck with Your Exam! 🎯**
