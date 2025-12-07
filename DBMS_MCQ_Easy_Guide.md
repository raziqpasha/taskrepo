# DBMS MCQ Easy Learning Guide 📚
## Quick Memory Tricks & Simplified Explanations

---

# 🎯 SECTION 1: DATABASE BASICS (Q1-4)

## Q1: What is a Database?
**Answer: (B) Structured collection of interrelated data**

### Simple Understanding:
- Database = Organized data storage (like a well-organized filing cabinet)
- Key features: Structured, Interrelated, No unnecessary duplication

### Memory Trick: 🧠
**"SIN" - Structured, Interrelated, No redundancy**

---

## Q2: What is DBMS's primary function?
**Answer: (B) Interface between users and database**

### Simple Understanding:
- DBMS = Middle-man between you and data
- Helps: Define, Retrieve, Update, Administer data

### Memory Trick: 🧠
**"DRUA" - Define, Retrieve, Update, Administer**
Think: "DBMS DRUAs data for you"

---

## Q3: Which level describes HOW data is stored on disk?
**Answer: (C) Physical Level (Internal Level)**

### Simple Understanding:
- Physical = Actual storage details (files, indexes)
- It's the LOWEST level (closest to hardware)

### Memory Trick: 🧠
**"Physical = Floor level = Lowest = Storage details"**

---

## Q4: Logical Level is concerned with?
**Answer: (A) Storage allocation and access paths**

### Simple Understanding:
- Logical Level = WHAT data is stored & relationships
- Middle level between Physical and External

### Memory Trick: 🧠
**"L-W-R" = Logical level = What data + Relationships**

---

# 🎯 SECTION 2: THREE SCHEMA ARCHITECTURE (Q5-8)

## Q5: View (External Schema) is?
**Answer: (D) View (External Schema)**

### Simple Understanding:
- External/View = User's personal view of database
- Hides complexity, shows only needed data

### Memory Trick: 🧠
**"E-V-U" = External = View = User-specific**
Think: "Each View for each User"

---

## Q6: Which is NOT a DBMS feature?
**Answer: (D) Exclusive focus on Machine Language Programming**

### Simple Understanding:
- DBMS uses HIGH-level languages (SQL), NOT machine language
- DBMS features: Redundancy control, Security, Sharing, Recovery

### Memory Trick: 🧠
**"DBMS is HIGH, not LOW"** (High-level SQL, not low-level machine code)

---

## Q7: Logical Data Independence means?
**Answer: (B) Changes in Conceptual Schema don't affect External Views**

### Simple Understanding:
- You can change database structure without breaking user applications
- Shield users from internal changes

### Memory Trick: 🧠
**"LDI = Logical protects User apps"**
Think: "Logical = Logic changes, Users don't care"

---

## Q8: Data Model describes?
**Answer: (B) Data, relationships, semantics, and constraints**

### Simple Understanding:
- Data Model = Blueprint showing:
  - What data exists
  - How data connects
  - Rules data must follow

### Memory Trick: 🧠
**"DRSC" = Data, Relationships, Semantics, Constraints**

---

# 🎯 SECTION 3: KEYS (Q9-11)

## Q9: Super Key is?
**Answer: (B) Any attribute(s) that uniquely identifies every tuple**

### Simple Understanding:
- Super Key = Can identify rows (may have extra attributes)
- Doesn't need to be minimal

### Memory Trick: 🧠
**"Super = Super-sized key (can have extras)"**

---

## Q10: Candidate Key is?
**Answer: (C) Candidate Key**

### Simple Understanding:
- Candidate Key = Minimal Super Key
- No extra attributes - just enough to identify

### Memory Trick: 🧠
**"Candidate = Minimum qualifications to get the job"**
{A,B} works, but neither {A} nor {B} alone works

---

## Q11: Primary Key cannot be NULL - which constraint?
**Answer: (B) Entity Integrity Constraint**

### Simple Understanding:
- Entity Integrity = Primary Key ≠ NULL
- Every row must be identifiable

### Memory Trick: 🧠
**"E-I = Entity needs Identity (not NULL)"**

---

# 🎯 SECTION 4: FOREIGN KEY & REFERENTIAL INTEGRITY (Q12-16)

## Q12: Foreign Key is?
**Answer: (B) References primary/candidate key of another relation**

### Simple Understanding:
- Foreign Key = Link to another table
- Points to Primary Key in parent table

### Memory Trick: 🧠
**"Foreign = From another country (table)"**

---

## Q13: Referential Integrity means?
**Answer: (C) Referential Integrity**

### Simple Understanding:
- Foreign Key value must exist in referenced table
- Can't point to non-existent data

### Memory Trick: 🧠
**"RI = Real reference (must exist)"**

---

## Q14: DeptID in EMPLOYEE referring to DID in DEPARTMENT is?
**Answer: (C) Foreign Key**

### Simple Understanding:
- EMPLOYEE.DeptID → DEPARTMENT.DID
- Creates link between tables

### Memory Trick: 🧠
**"Child points to Parent = Foreign Key"**

---

## Q15: NULL in Foreign Key means?
**Answer: (C) Tuple doesn't participate in relationship**

### Simple Understanding:
- NULL FK = "No relationship right now"
- Valid if FK is not part of Primary Key

### Memory Trick: 🧠
**"NULL FK = Not linked yet"**

---

## Q16: Data Dictionary holds?
**Answer: (C) Data Dictionary (Catalog)**

### Simple Understanding:
- Data Dictionary = Metadata storage
- Stores: Schema definitions, Constraints, Security info

### Memory Trick: 🧠
**"DD = Database's Dictionary (describes everything)"**

---

# 🎯 SECTION 5: NORMALIZATION & DECOMPOSITION (Q17-27)

## Q17: Conceptual Schema represents?
**Answer: (D) Conceptual Schema (Logical Level)**

### Simple Understanding:
- Community view of entire database
- Bridge between physical storage and user views

### Memory Trick: 🧠
**"Conceptual = Community view"**

---

## Q18: Foreign Key enforces?
**Answer: (D) Referential Integrity**

### Simple Understanding:
- FK ensures valid references between tables

### Memory Trick: 🧠
**"FK → RI" (Foreign Key enforces Referential Integrity)**

---

## Q19: Lossless Join Decomposition requires?
**Answer: (B) Natural join of all sub-relations = Original relation**

### Simple Understanding:
- Join back = Get original data (no loss, no extra)

### Memory Trick: 🧠
**"Lossless = Join back = Same as before"**

---

## Q20: Binary decomposition is lossless if?
**Answer: (B) Common attributes form superkey for R₁ or R₂**

### Simple Understanding:
- Intersection must be a key for at least one part

### Memory Trick: 🧠
**"Common = Key for one = Lossless"**

---

## Q21: R(A,B,C) with F={A→B, B→C}, decomposed to {R1(A,B), R2(B,C)}?
**Answer: (A) Both lossless and dependency preserving**

### Simple Understanding:
- Intersection {B} is key for R2 (B→C) ✓ Lossless
- All FDs preserved ✓ Dependency Preserving

### Memory Trick: 🧠
**"B is key for R2, all FDs kept = Both properties"**

---

## Q22: Dependency Preserving means?
**Answer: (B) Closure of projected FDs = Closure of original FDs**

### Simple Understanding:
- All original rules can still be checked locally

### Memory Trick: 🧠
**"DP = Don't lose rules when splitting"**

---

## Q23: Why is Lossless decomposition crucial?
**Answer: (B) Prevents spurious tuples when joining back**

### Simple Understanding:
- Lossy decomposition = Fake rows appear when joining
- Corrupts data integrity

### Memory Trick: 🧠
**"Lossless = No fake rows"**

---

## Q24: 3NF vs BCNF trade-off?
**Answer: (B) 3NF guarantees both lossless & dependency preserving**

### Simple Understanding:
- 3NF = Both properties guaranteed
- BCNF = Only lossless guaranteed (may lose dependencies)

### Memory Trick: 🧠
**"3NF = 3 guarantees (structure + lossless + DP)"**
**"BCNF = Better structure, but may lose DP"**

---

## Q25: Chase Algorithm is for?
**Answer: (C) Decomposition Table (Chase) algorithm**

### Simple Understanding:
- Tests if multi-table decomposition is lossless
- Used when pairwise test doesn't apply

### Memory Trick: 🧠
**"Chase = Check lossless for many tables"**

---

## Q26: BCNF decomposition is?
**Answer: (C) Always lossless, may lose dependency preservation**

### Memory Trick: 🧠
**"BCNF = Best structure, Can lose FDs"**

---

# 🎯 SECTION 6: SQL BASICS (Q27-42)

## Q27: SQL stands for?
**Answer: (D) Structured Query Language**

### Memory Trick: 🧠
**"SQL = Structured Query Language"** (NOT Standard!)

---

## Q28: NOT a type of SQL command?
**Answer: (C) DSL (Data Standardization Language)**

### Simple Understanding:
Real SQL types:
- DDL (Define) - CREATE, ALTER, DROP
- DML (Manipulate) - SELECT, INSERT, UPDATE, DELETE
- DCL (Control) - GRANT, REVOKE
- TCL (Transaction) - COMMIT, ROLLBACK

### Memory Trick: 🧠
**"DDL-DML-DCL-TCL" = Real SQL types**
**"DSL = Doesn't exist"**

---

## Q29: CREATE TABLE belongs to?
**Answer: (C) DDL**

### Memory Trick: 🧠
**"CREATE = DDL" (Defining structure)**

---

## Q30: Remove table completely?
**Answer: (C) DROP TABLE**

### Simple Understanding:
- DROP = Delete everything (structure + data)
- DELETE = Remove rows only
- TRUNCATE = Remove data, keep structure

### Memory Trick: 🧠
**"DROP = Destroy completely"**

---

## Q31: UNIQUE constraint allows?
**Answer: (B) UNIQUE**

### Simple Understanding:
- UNIQUE = All different values, but NULL allowed (once)
- PRIMARY KEY = Unique + NOT NULL

### Memory Trick: 🧠
**"UNIQUE = Unique values, NULL okay"**

---

## Q32: Add/modify columns?
**Answer: (B) ALTER TABLE**

### Memory Trick: 🧠
**"ALTER = Alter structure"**

---

## Q33: Link two tables?
**Answer: (D) FOREIGN KEY**

### Memory Trick: 🧠
**"FK = Links tables"**

---

## Q34: Restrict value range?
**Answer: (B) CHECK**

### Simple Understanding:
- CHECK (Salary > 0) - Sets rules for values

### Memory Trick: 🧠
**"CHECK = Check if value is valid"**

---

## Q35: Filter rows BEFORE grouping?
**Answer: (C) WHERE**

### Simple Understanding:
- WHERE = Filter individual rows first
- HAVING = Filter groups after

### Memory Trick: 🧠
**"WHERE first, HAVING after GROUP BY"**

---

## Q36: Remove duplicates?
**Answer: (C) DISTINCT**

### Memory Trick: 🧠
**"DISTINCT = Different/Unique results only"**

---

## Q37: Average of column?
**Answer: (B) AVG**

### Memory Trick: 🧠
**"AVG = Average"**

---

## Q38: HAVING requires?
**Answer: (C) GROUP BY**

### Memory Trick: 🧠
**"HAVING = Have a GROUP BY first"**

---

## Q39: NOT a join type?
**Answer: (D) Parallel Join**

### Simple Understanding:
Real joins: Inner, Outer (Left/Right/Full), Cross

### Memory Trick: 🧠
**"IOC = Inner, Outer, Cross (real joins)"**

---

## Q40: CROSS JOIN result?
**Answer: (B) M × N rows (Cartesian product)**

### Memory Trick: 🧠
**"CROSS = Multiply rows"**

---

## Q41: Count ALL rows including NULLs?
**Answer: (B) COUNT(*)**

### Simple Understanding:
- COUNT(*) = All rows
- COUNT(column) = Non-NULL values only

### Memory Trick: 🧠
**"COUNT(*) = Count EVERYTHING"**

---

## Q42: Pattern matching?
**Answer: (B) LIKE**

### Simple Understanding:
- % = Any characters
- _ = One character

### Memory Trick: 🧠
**"LIKE = Looking for patterns"**

---

# 🎯 SECTION 7: SQL COMMANDS (Q43-55)

## Q43: Remove all rows, keep structure?
**Answer: (D) TRUNCATE TABLE**

### Memory Trick: 🧠
**"TRUNCATE = Trim data, keep Table structure"**

---

## Q44: Default ORDER BY?
**Answer: (C) Ascending (ASC)**

### Memory Trick: 🧠
**"Default = A to Z = Ascending"**

---

## Q45: Make changes permanent?
**Answer: (C) COMMIT**

### Memory Trick: 🧠
**"COMMIT = Confirm changes"**

---

## Q46: Undo changes?
**Answer: (C) ROLLBACK**

### Memory Trick: 🧠
**"ROLLBACK = Roll back to before"**

---

## Q47: View is?
**Answer: (C) Virtual table based on SQL query**

### Simple Understanding:
- View = Stored query, not actual data
- Updates dynamically

### Memory Trick: 🧠
**"View = Virtual (not real table)"**

---

## Q48: Give permissions?
**Answer: (C) GRANT**

### Memory Trick: 🧠
**"GRANT = Give rights"**

---

## Q49: Take away permissions?
**Answer: (A) REVOKE**

### Memory Trick: 🧠
**"REVOKE = Remove rights"**

---

## Q50: NULL means?
**Answer: (C) Unknown, not applicable, or missing**

### Memory Trick: 🧠
**"NULL ≠ 0 ≠ empty string, NULL = Unknown"**

---

## Q51: Check for NULL?
**Answer: (B) IS NULL**

### Simple Understanding:
- Can't use = NULL (NULL isn't comparable)
- Must use IS NULL or IS NOT NULL

### Memory Trick: 🧠
**"IS NULL (not = NULL)"**

---

## Q52: AS keyword?
**Answer: (C) Temporary alias**

### Memory Trick: 🧠
**"AS = Alias"**

---

## Q53: Limit rows returned?
**Answer: (B) LIMIT N (or TOP N)**

### Memory Trick: 🧠
**"LIMIT = Limit results"**

---

# 🎯 SECTION 8: INDEXING (Q54-73)

## Q54: Why use indexes?
**Answer: (C) Speed up data retrieval**

### Memory Trick: 🧠
**"Index = Fast finding"**

---

## Q55: Dense Index?
**Answer: (C) Dense Index**

### Simple Understanding:
- Dense = Entry for EVERY record
- Sparse = Entry for some records (first in each block)

### Memory Trick: 🧠
**"Dense = Every record, Sparse = Some records"**

---

## Q56: Sparse Index?
**Answer: (D) Sparse Index**

### Memory Trick: 🧠
**"Sparse = Scattered entries (not all)"**

---

## Q57: Primary Index built on?
**Answer: (C) Primary Key, data file ordered by this key**

### Memory Trick: 🧠
**"Primary Index = Primary Key + Ordered data"**

---

## Q58: Clustered Index characteristic?
**Answer: (C) Physical order = Index order**

### Memory Trick: 🧠
**"Clustered = Collected together physically"**

---

## Q59: How is data stored with Clustered Index?
**Answer: (B) Data ordered according to index key**

### Memory Trick: 🧠
**"Clustered = Data follows index order"**

---

## Q60: How many Primary Indexes per table?
**Answer: (B) Exactly one**

### Memory Trick: 🧠
**"1 Primary Key = 1 Primary Index"**

---

## Q61: Secondary Index is?
**Answer: (C) Secondary Index**

### Simple Understanding:
- Built on non-ordering attribute
- Always Dense (needs entry for every record)

### Memory Trick: 🧠
**"Secondary = Second access path, always Dense"**

---

## Q62: Primary vs Secondary Index difference?
**Answer: (B) Primary determines physical order; Secondary doesn't**

### Memory Trick: 🧠
**"Primary = Physical order, Secondary = Separate order"**

---

## Q63: Multi-level Index purpose?
**Answer: (C) Speed up searching large index**

### Memory Trick: 🧠
**"Multi-level = Multiple levels to search faster"**

---

## Q64: Structure for Multi-level Index?
**Answer: (C) B-Tree or B+ Tree**

### Memory Trick: 🧠
**"B+Tree = Best for indexing"**

---

## Q65: B-Tree data pointers location?
**Answer: (C) Root, internal, and leaf nodes**

### Memory Trick: 🧠
**"B-Tree = Data pointers Everywhere"**

---

## Q66: Preferred index for databases?
**Answer: (B) B+ Tree**

### Simple Understanding:
- B+ Tree = Data only in leaves + leaves linked
- Great for range queries

### Memory Trick: 🧠
**"B+ = Better for ranges (leaves linked)"**

---

## Q67: B+ Tree data pointers location?
**Answer: (C) Leaf Nodes only**

### Memory Trick: 🧠
**"B+ = Bottom only (leaves)"**

---

## Q68: Unique Index?
**Answer: (B) Unique Index**

### Memory Trick: 🧠
**"Unique key = Unique Index"**

---

## Q69: Index disadvantage?
**Answer: (C) Slows down INSERT/UPDATE/DELETE**

### Memory Trick: 🧠
**"Index: Fast READ, Slow WRITE"**

---

## Q70: Fan-out means?
**Answer: (C) Maximum child pointers per node**

### Memory Trick: 🧠
**"Fan-out = How many branches fan out"**

---

## Q71: Unordered data file needs?
**Answer: (B) Dense Index**

### Memory Trick: 🧠
**"Unordered = Dense needed (can't skip)"**

---

## Q72: Bottom level of Multi-level Index?
**Answer: (B) Sparse index of data file**

### Memory Trick: 🧠
**"Bottom = Basic sparse index on data"**

---

## Q73: B+ Tree advantage?
**Answer: (B) Higher fan-out (internal nodes only have keys)**

### Memory Trick: 🧠
**"B+ = More keys per node = Shorter tree = Faster"**

---

# 🎯 SECTION 9: ER MODEL (Q74-88)

## Q74: E-R Model purpose?
**Answer: (B) High-level conceptual blueprint**

### Memory Trick: 🧠
**"E-R = Early design (conceptual)"**

---

## Q75: Entity represented by?
**Answer: (C) Rectangle**

### Memory Trick: 🧠
**"Entity = Rectangle"** 📦

---

## Q76: Multivalued Attribute?
**Answer: (C) Double ellipse**

### Memory Trick: 🧠
**"Multi = Double oval"** ⭕⭕

---

## Q77: Cardinality Constraints?
**Answer: (C) Cardinality Constraints**

### Simple Understanding:
- How many times entity can participate (1:1, 1:N, M:N)

### Memory Trick: 🧠
**"Cardinality = Count of relationships"**

---

## Q78: Weak Entity?
**Answer: (C) Has no key of its own, depends on strong entity**

### Memory Trick: 🧠
**"Weak = needs help from Strong"**
Represented by: Double rectangle 📦📦

---

## Q79: Recursive Relationship?
**Answer: (C) Recursive Relationship**

### Simple Understanding:
- Same entity type relates to itself
- Example: Employee supervises Employee

### Memory Trick: 🧠
**"Recursive = Relates to itself"**

---

## Q80: Total Participation?
**Answer: (A) Total Participation**

### Simple Understanding:
- EVERY entity must participate
- Shown by double line ═══

### Memory Trick: 🧠
**"Total = ALL must participate (double line)"**

---

## Q81: 1:N relationship means?
**Answer: (C) One in E1 → Many in E2; One in E2 → One in E1**

### Memory Trick: 🧠
**"1:N = One Department, Many Employees"**

---

## Q82: Ternary Relationship?
**Answer: (D) Ternary (3 entities involved)**

### Memory Trick: 🧠
**"Ternary = Three entities"**

---

## Q83: Key Attribute?
**Answer: (A) Single underline in ellipse**

### Memory Trick: 🧠
**"Key = Underlined"** _Name_

---

## Q84: Derived Attribute?
**Answer: (B) Derived Attribute**

### Simple Understanding:
- Calculated from other attributes
- Example: Age from BirthDate
- Shown by dashed ellipse - - -

### Memory Trick: 🧠
**"Derived = Dashed oval"**

---

## Q85: Simple Attribute example?
**Answer: (C) ZipCode**

### Simple Understanding:
- Cannot be subdivided further
- ZipCode is atomic (single value)

### Memory Trick: 🧠
**"Simple = Single, can't split"**

---

## Q86: Multi-valued Attribute creates?
**Answer: (A) Separate table**

### Memory Trick: 🧠
**"Multi-valued = Multiple tables needed"**

---

## Q87: Weak Entity identifying relationship is?
**Answer: (C) 1:N from strong to weak**

### Memory Trick: 🧠
**"Strong:Weak = 1:N always"**

---

## Q88: Generalization/Specialization based on?
**Answer: (C) Inheritance**

### Memory Trick: 🧠
**"ISA = Inheritance (subclass inherits from superclass)"**

---

# 🎯 SECTION 10: RELATIONAL ALGEBRA (Q89-104)

## Q89: Selection (σ)?
**Answer: (C) Selection (σ)**

### Simple Understanding:
- Filters ROWS based on condition
- σ condition (Table)

### Memory Trick: 🧠
**"σ = Select rows (horizontal slice)"**

---

## Q90: Projection (π)?
**Answer: (C) Projection (π)**

### Simple Understanding:
- Keeps only specified COLUMNS

### Memory Trick: 🧠
**"π = Pick columns (vertical slice)"**

---

## Q91: Fundamental operations?
**Answer: (B) σ, π, ∪, ×, ρ**

### Simple Understanding:
- Selection, Projection, Union, Cartesian Product, Rename

### Memory Trick: 🧠
**"SPUCR" = Select, Project, Union, Cartesian, Rename**

---

## Q92: R ∪ S result?
**Answer: (C) All tuples in R or S, duplicates removed**

### Memory Trick: 🧠
**"Union = Combine unique"**

---

## Q93: Union Compatible means?
**Answer: (C) Same number of attributes, same domains**

### Memory Trick: 🧠
**"Union needs: Same columns, Same types"**

---

## Q94: Natural Join =?
**Answer: (C) Cartesian Product + Selection + Projection**

### Memory Trick: 🧠
**"Natural Join = Auto-match common columns"**

---

## Q95: R - S returns?
**Answer: (B) Set Difference**

### Memory Trick: 🧠
**"Minus = In R but not in S"**

---

## Q96: Theta Join vs Equijoin?
**Answer: (B) Theta allows any comparison; Equijoin uses only =**

### Memory Trick: 🧠
**"Theta = any θ (<,>,=); Equijoin = Equal only"**

---

## Q97: R ∩ S equivalent?
**Answer: (A) R - (R - S)**

### Memory Trick: 🧠
**"Intersection = R minus (R minus S)"**

---

## Q98: Left Outer Join?
**Answer: (C) All from left, even if no match**

### Memory Trick: 🧠
**"LEFT join = Left table ALL included"**

---

## Q99: Division (÷)?
**Answer: (C) Division**

### Simple Understanding:
- "Find all X related to every Y"
- Example: Students taking ALL courses

### Memory Trick: 🧠
**"Division = For ALL queries"**

---

## Q100: Cartesian Product size?
**Answer: (B) M × N**

### Memory Trick: 🧠
**"Cartesian = Multiply"**

---

## Q101: (R∩S) ⊆ (R∪S)?
**Answer: (C) Always true**

### Memory Trick: 🧠
**"Common items always fewer than total items"**

---

## Q102: "Closed" means?
**Answer: (C) Input relation → Output relation**

### Memory Trick: 🧠
**"Closed = Output same type as input"**

---

## Q103: Cartesian & Natural Join are?
**Answer: (A) Both associative**

### Memory Trick: 🧠
**"(A×B)×C = A×(B×C) - Order doesn't matter"**

---

## Q104: Relational Algebra is procedural because?
**Answer: (B) User specifies HOW to get result**

### Memory Trick: 🧠
**"Algebra = sequence of steps (procedural)"**
**"SQL = what you want (declarative)"**

---

# 🎯 SECTION 11: TRANSACTIONS & ACID (Q105-123)

## Q105: Transaction is?
**Answer: (C) Logical unit - all or nothing**

### Memory Trick: 🧠
**"Transaction = Together or not at all"**

---

## Q106: Transaction end operations?
**Answer: (D) COMMIT and ROLLBACK**

### Memory Trick: 🧠
**"COMMIT = Confirm, ROLLBACK = Reverse"**

---

## Q107: Durability ensures?
**Answer: (D) Durability**

### Simple Understanding:
- Committed changes survive crashes
- Written to disk/log

### Memory Trick: 🧠
**"Durability = Data survives crashes"**

---

## Q108: Atomicity ensures?
**Answer: (C) All-or-nothing execution**

### Memory Trick: 🧠
**"Atomic = Can't be split"**

---

## Q109: Consistency ensures?
**Answer: (C) Database moves from valid state to valid state**

### Memory Trick: 🧠
**"Consistency = Constraints always satisfied"**

---

## Q110: Isolation ensures?
**Answer: (D) Transactions run as if alone**

### Memory Trick: 🧠
**"Isolation = Independent execution"**

---

## Q111: Schedule is?
**Answer: (C) Sequence of interleaved operations**

### Memory Trick: 🧠
**"Schedule = Order of execution"**

---

## Q112: Serial Schedule?
**Answer: (B) One transaction completes before next starts**

### Memory Trick: 🧠
**"Serial = Sequential, no interleaving"**

---

## Q113: Concurrent Schedule?
**Answer: (C) Operations interleaved**

### Memory Trick: 🧠
**"Concurrent = Mix operations"**

---

## Q114: Serializable means?
**Answer: (C) Same result as some serial schedule**

### Memory Trick: 🧠
**"Serializable = Looks like serial"**

---

## Q115: 2PL ensures?
**Answer: (A) Serializable**

### Memory Trick: 🧠
**"2PL = Serializable guaranteed"**

---

## Q116: Two phases of 2PL?
**Answer: (B) Growing Phase & Shrinking Phase**

### Simple Understanding:
- Growing: Acquire locks, no releases
- Shrinking: Release locks, no acquires

### Memory Trick: 🧠
**"Grow first, Shrink later"**

---

## Q117: 2PL disadvantage?
**Answer: (A) Deadlocks**

### Memory Trick: 🧠
**"2PL = Deadlock possible"**

---

## Q118: If T1 has X-lock, T2 can get?
**Answer: (D) No lock**

### Simple Understanding:
- X-lock = Exclusive = No one else can access

### Memory Trick: 🧠
**"X = eXclusive = No sharing"**

---

## Q119: Cascading Rollback?
**Answer: (C) Cascading Rollback**

### Simple Understanding:
- T2 reads T1's uncommitted data
- T1 fails → T2 must rollback too

### Memory Trick: 🧠
**"Cascade = Chain of rollbacks"**

---

## Q120: Recoverable Schedule?
**Answer: (C) Commit only after dependencies commit**

### Memory Trick: 🧠
**"Recoverable = Read from committed only"**

---

## Q121: Non-serializable = graph has?
**Answer: (C) Cycle**

### Memory Trick: 🧠
**"Cycle in graph = Not serializable"**

---

## Q122: Concurrent Schedule benefit?
**Answer: (C) Increased throughput**

### Memory Trick: 🧠
**"Concurrent = Better CPU usage"**

---

## Q123: Highest isolation level?
**Answer: (C) Serializable**

### Memory Trick: 🧠
**"Serializable = Safest, prevents all anomalies"**

---

# 🎯 SECTION 12: ADDITIONAL QUESTIONS (Q124-144)

## Q124: Primary Index file ordered by?
**Answer: (C) Primary Index**

---

## Q125: Clustering Index on non-key?
**Answer: (C) False - can be on any ordering field**

---

## Q126: Sparse Index entry for?
**Answer: (C) First record in each block**

---

## Q127: Dense Index advantage?
**Answer: (C) Faster direct lookup**

---

## Q128: Secondary Index field?
**Answer: (B) Not the ordering field**

---

## Q129: Multi-level Index purpose?
**Answer: (B) Reduce disk I/Os for large index**

---

## Q130: Non-unique Secondary Index needs?
**Answer: (C) List of pointers to all matching records**

---

## Q131: Clustering Index property?
**Answer: (C) Only index matching physical data order**

---

## Q132: Fragmentation must satisfy?
**Answer: (D) Completeness, Reconstruction, Disjointness**

---

## Q133: σ Age>18 (Students) does?
**Answer: (B) Keeps only tuples with Age > 18**

---

## Q134: Natural Join automatically?
**Answer: (B) Joins on same-named attributes**

---

## Q135: Dense Index stores at leaf?
**Answer: (B) Dense Index**

---

## Q136: B+ Tree property?
**Answer: (B) All leaves at same level**

---

## Q137: ACID truth?
**Answer: (B) Isolation prevents interference**

---

## Q138: Sparse Index smaller because?
**Answer: (A) Stores only subset of keys**

---

## Q139: Violation if crash before log?
**Answer: (A) Atomicity**

---

## Q140: R ⋈ S requires?
**Answer: (B) Matching domains for join attributes**

---

## Q141: Multi-level index in memory?
**Answer: (C) Only highest level (root)**

---

## Q142: 1:N, Total participation of Employee?
**Answer: (B) Employee table references Department**

---

## Q143: Weak entity OrderItem?
**Answer: (A) Composite key (OrderID + ItemNo)**

---

## Q144: Ternary relationship representation?
**Answer: (B) Single table with all participating keys**

---

# 📝 QUICK REFERENCE CHEAT SHEET

## SQL Commands Categories:
| Category | Purpose | Examples |
|----------|---------|----------|
| DDL | Define structure | CREATE, ALTER, DROP |
| DML | Manipulate data | SELECT, INSERT, UPDATE, DELETE |
| DCL | Control access | GRANT, REVOKE |
| TCL | Manage transactions | COMMIT, ROLLBACK |

## ACID Properties:
| Property | Meaning | Memory Trick |
|----------|---------|--------------|
| Atomicity | All or nothing | "Atom can't split" |
| Consistency | Valid → Valid | "Constraints kept" |
| Isolation | Independent | "Isolated execution" |
| Durability | Survives crash | "Data on Disk" |

## Keys Hierarchy:
```
Super Key (may have extras)
    ↓
Candidate Key (minimal)
    ↓
Primary Key (chosen one)
    ↓
Foreign Key (links tables)
```

## Index Types:
| Type | Entries | Use Case |
|------|---------|----------|
| Dense | Every record | Fast lookup |
| Sparse | First per block | Less storage |
| Primary | On ordering key | Main access |
| Secondary | On any field | Alternative access |
| Clustered | = Physical order | One per table |

## ER Diagram Symbols:
| Symbol | Meaning |
|--------|---------|
| Rectangle | Entity |
| Oval | Attribute |
| Diamond | Relationship |
| Double Rectangle | Weak Entity |
| Double Oval | Multi-valued |
| Dashed Oval | Derived |
| Underline | Key Attribute |
| Double Underline | Partial Key |
| Double Line | Total Participation |

## Normal Forms:
- **1NF**: Atomic values (no repeating groups)
- **2NF**: 1NF + No partial dependencies
- **3NF**: 2NF + No transitive dependencies
- **BCNF**: Every determinant is a superkey

---

# 🎓 EXAM DAY TIPS

1. **For Keys**: Super → Candidate → Primary (gets more specific)
2. **For Levels**: Physical (lowest) → Logical → External (highest)
3. **For SQL**: DDL=Define, DML=Data, DCL=Control, TCL=Transaction
4. **For Joins**: LEFT=All left rows, RIGHT=All right rows, FULL=All rows
5. **For ACID**: A=All-or-nothing, C=Constraints, I=Independent, D=Disk
6. **For 2PL**: Grow locks, then Shrink locks
7. **For B+Tree**: Data ONLY in leaves, leaves linked

**Good luck with your exam! 📚✨**
