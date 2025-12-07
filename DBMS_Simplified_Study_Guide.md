# DBMS MCQ - Simplified Study Guide
## Easy to Learn & Remember for Exams

---

## 1. DATABASE DEFINITION

**Q: What is a Database?**
- (a) Application programs
- (b) **Structured collection of related data (minimal redundancy)** ✓
- (c) Programming interface
- (d) Real-time transaction system

**Memory Trick:** Database = Data + Base (foundation). Think: "Organized data foundation, no duplicates!"

**Key Point:** Database = Organized + Related + No redundancy

---

## 2. DBMS FUNCTION

**Q: What does DBMS do?**
- (a) Manage hardware
- (b) **Interface between users and data (provides DDL, DML)** ✓
- (c) Execute algorithms
- (d) Machine code instructions

**Memory Trick:** DBMS = Database Manager. It's the "middleman" between you and data.

**Key Point:** DBMS = Software that manages data access

---

## 3. PHYSICAL LEVEL

**Q: Which level describes HOW data is stored (files, indexes)?**
- (a) External Level
- (b) Logical Level
- (c) **Physical Level (Internal Level)** ✓
- (d) Abstraction Level

**Memory Trick:** Physical = PHysical Hardware. Lowest level = storage details.

**Key Point:** Physical = Storage details (files, blocks, indexes)

---

## 4. LOGICAL LEVEL

**Q: Which level describes WHAT data is stored (structure, relationships)?**
- (a) External Level
- (b) **Logical Level (Conceptual Level)** ✓
- (c) Physical Level
- (d) Design Level

**Memory Trick:** Logical = "What" you store. Conceptual = Concept/idea of data.

**Key Point:** Logical = Structure & relationships (WHAT, not HOW)

---

## 5. EXTERNAL LEVEL (VIEW)

**Q: Which level provides user-specific simplified view?**
- (a) Physical Schema
- (b) Internal Schema
- (c) Conceptual Schema
- (d) **View (External Schema)** ✓

**Memory Trick:** External = EXternal users see this. View = What user sees.

**Key Point:** External = User's view (simplified, hides complexity)

---

## 6. LOGICAL DATA INDEPENDENCE

**Q: What ensures changes in Conceptual Schema don't affect External Views?**
- (a) Physical changes don't affect Logical
- (b) **Conceptual changes don't affect External Views** ✓
- (c) Physical storage can change
- (d) DBMS is OS independent

**Memory Trick:** Independence = Changes at one level don't break another level.

**Key Point:** Logical Independence = Conceptual changes → External views safe

---

## 7. DATA MODEL

**Q: What describes data structure, relationships, semantics, constraints?**
- (a) Physical storage devices
- (b) **Data, relationships, semantics, constraints** ✓
- (c) Operating system instructions
- (d) Application logic

**Memory Trick:** Model = Blueprint. Shows structure + rules.

**Key Point:** Data Model = Structure + Relationships + Rules

---

## 8. DBMS CHARACTERISTICS

**Q: Which is NOT a primary DBMS feature?**
- (a) Data Redundancy Control
- (b) Data Sharing & Security
- (c) Concurrent Access & Crash Recovery
- (d) **Machine Language Programming** ✓

**Memory Trick:** DBMS = High-level (SQL), NOT low-level machine code.

**Key Point:** DBMS uses high-level languages (SQL), not machine code

---

## 9. SUPER KEY

**Q: What uniquely identifies every tuple (may not be minimal)?**
- (a) Minimal unique set
- (b) **Any unique set (minimality not required)** ✓
- (c) Foreign key reference
- (d) Non-key attributes

**Memory Trick:** Super = "Super" (bigger than needed). Can have extra attributes.

**Key Point:** Super Key = Unique (but may have extra attributes)

---

## 10. CANDIDATE KEY

**Q: What uniquely identifies tuples AND is minimal?**
- (a) Foreign Key
- (b) Simple Key
- (c) **Candidate Key** ✓
- (d) Secondary Key

**Memory Trick:** Candidate = "Candidate for Primary Key". Must be minimal + unique.

**Key Point:** Candidate Key = Unique + Minimal (no extra attributes)

---

## 11. ENTITY INTEGRITY

**Q: What ensures primary key cannot be NULL?**
- (a) Referential Integrity
- (b) **Entity Integrity** ✓
- (c) Domain Constraint
- (d) Key Constraint

**Memory Trick:** Entity = Each row. Integrity = Must have identity (PK not null).

**Key Point:** Entity Integrity = Primary Key ≠ NULL (every row identifiable)

---

## 12. FOREIGN KEY

**Q: What references primary key of another table?**
- (a) Primary Key
- (b) Super Key
- (c) **Foreign Key** ✓
- (d) Secondary Key

**Memory Trick:** Foreign = From another table. Points to parent table's PK.

**Key Point:** Foreign Key = References another table's Primary Key

---

## 13. REFERENTIAL INTEGRITY

**Q: What ensures foreign key values reference valid primary keys?**
- (a) Entity Integrity
- (b) Domain Integrity
- (c) **Referential Integrity** ✓
- (d) Constraint Integrity

**Memory Trick:** Referential = Reference must be valid. Can't point to non-existent row.

**Key Point:** Referential Integrity = Foreign key must match existing primary key

---

## 14. FOREIGN KEY IN RELATION

**Q: If DeptID in EMPLOYEE refers to DID in DEPARTMENT, what is DeptID?**
- (a) Primary Key
- (b) Super Key
- (c) **Foreign Key** ✓
- (d) Secondary Key

**Memory Trick:** DeptID "points to" another table → Foreign Key.

**Key Point:** Attribute referencing another table = Foreign Key

---

## 15. NULL IN FOREIGN KEY

**Q: What does NULL in foreign key mean?**
- (a) Must match NULL in referenced table
- (b) Tuple is invalid
- (c) **Tuple doesn't participate in relationship (valid if FK not part of PK)** ✓
- (d) Entire relation inconsistent

**Memory Trick:** NULL = "No relationship yet". Allowed if FK is optional.

**Key Point:** NULL in FK = No relationship (optional link)

---

## 16. DATA DICTIONARY

**Q: What stores schema definitions, constraints, security info?**
- (a) Data Files
- (b) Index Structures
- (c) **Data Dictionary (Catalog)** ✓
- (d) Application Programs

**Memory Trick:** Dictionary = Definitions. Catalog = Metadata store.

**Key Point:** Data Dictionary = Stores metadata (schema, constraints, security)

---

## 17. CONCEPTUAL SCHEMA

**Q: What represents community view of entire database?**
- (a) External Schema
- (b) Internal Schema
- (c) View Schema
- (d) **Conceptual Schema (Logical Level)** ✓

**Memory Trick:** Conceptual = Concept for all users. Community = Everyone.

**Key Point:** Conceptual Schema = Global structure for all users

---

## 18. REFERENTIAL INTEGRITY TERM

**Q: What ensures foreign key values reference valid primary keys?**
- (a) Entity Integrity
- (b) Key Constraint
- (c) Entity Integrity
- (d) **Referential Integrity** ✓

**Memory Trick:** Same as Q13. Referential = Reference must exist.

**Key Point:** Referential Integrity = FK must reference existing PK

---

## 19. LOSSLESS DECOMPOSITION REQUIREMENT

**Q: What is required for lossless join decomposition?**
- (a) Union of FDs equivalent
- (b) **Natural join of sub-relations equals original** ✓
- (c) Intersection contains PK
- (d) Size must be less

**Memory Trick:** Lossless = No data lost. Join back = Get original data.

**Key Point:** Lossless = Join sub-tables → Get original table (no spurious tuples)

---

## 20. BINARY DECOMPOSITION LOSSLESS

**Q: When is binary decomposition R→R1,R2 lossless?**
- (a) Common attributes form superkey for R
- (b) **Common attributes form superkey for R1 OR R2** ✓
- (c) R1∩R2 = all attributes
- (d) All FDs in R1 or R2

**Memory Trick:** Common attributes = "Link". Must be superkey in at least one.

**Key Point:** Lossless if: Common attributes = Superkey in R1 OR R2

---

## 21. LOSSLESS & DEPENDENCY PRESERVING

**Q: For R(A,B,C) with F={A→B, B→C}, decomposition R1(A,B), R2(B,C) is?**
- (a) **Both lossless and dependency preserving** ✓
- (b) Lossless but not dependency preserving
- (c) Dependency preserving but not lossless
- (d) Neither

**Memory Trick:** Common = {B}. B→C makes B superkey of R2 → Lossless. All FDs preserved.

**Key Point:** Check: Common attribute = Superkey? AND All FDs preserved?

---

## 22. DEPENDENCY PRESERVING

**Q: When is decomposition dependency preserving?**
- (a) Every FD directly in some Ri
- (b) **Closure of projected FDs = Closure of original FDs** ✓
- (c) Set difference is empty
- (d) Union of attributes is superkey

**Memory Trick:** Preserving = Can enforce all original rules using decomposed tables.

**Key Point:** Dependency Preserving = All original FDs can be checked in sub-tables

---

## 23. LOSSLESS IMPORTANCE

**Q: Why is lossless join crucial?**
- (a) Simplifies query optimization
- (b) Reduces storage
- (c) **Prevents spurious tuples when joining** ✓
- (d) Controls concurrency

**Memory Trick:** Lossless = No fake data. Spurious = Fake/wrong rows appear.

**Key Point:** Lossless = Join gives correct data (no fake rows)

---

## 24. NORMAL FORMS TRADE-OFF

**Q: Which statement about BCNF vs 3NF is true?**
- (a) BCNF always lossless + dependency preserving
- (b) **3NF always lossless + dependency preserving** ✓
- (c) BCNF always lossless (may lose dependencies)
- (d) 3NF necessary for table

**Memory Trick:** 3NF = Safe (always preserves both). BCNF = May lose dependencies.

**Key Point:** 3NF = Guaranteed both properties. BCNF = May lose dependencies

---

## 25. CHASE ALGORITHM

**Q: What tests if multi-table decomposition is lossless?**
- (a) Attribute Closure
- (b) Dependency Basis
- (c) **Chase Algorithm (Decomposition Table)** ✓
- (d) Canonical Cover

**Memory Trick:** Chase = "Chase" through table to find if lossless.

**Key Point:** Chase Algorithm = Tests losslessness for n>2 tables

---

## 26. SQL FULL FORM

**Q: What does SQL stand for?**
- (a) Standard Query Language
- (b) Structured Question Language
- (c) Sequential Query Logic
- (d) **Structured Query Language** ✓

**Memory Trick:** SQL = Structured Query Language. Remember: "Structured" not "Standard".

**Key Point:** SQL = Structured Query Language

---

## 27. SQL COMMAND TYPES

**Q: Which is NOT a SQL command type?**
- (a) DDL
- (b) DCL
- (c) **DSL (Data Standardization Language)** ✓
- (d) DML

**Memory Trick:** SQL types: DDL, DML, DCL, TCL. DSL doesn't exist.

**Key Point:** SQL types: DDL, DML, DCL, TCL (NOT DSL)

---

## 28. CREATE TABLE CATEGORY

**Q: CREATE TABLE belongs to which category?**
- (a) DML
- (b) DCL
- (c) **DDL** ✓
- (d) TCL

**Memory Trick:** CREATE = Define structure → DDL (Data Definition Language).

**Key Point:** CREATE/ALTER/DROP = DDL (structure definition)

---

## 29. DROP TABLE

**Q: What permanently removes table structure and all data?**
- (a) DELETE TABLE
- (b) REMOVE TABLE
- (c) **DROP TABLE** ✓
- (d) TRUNCATE TABLE

**Memory Trick:** DROP = Delete everything. TRUNCATE = Delete data only (keeps structure).

**Key Point:** DROP = Remove table completely. TRUNCATE = Remove data only

---

## 30. UNIQUE CONSTRAINT

**Q: What ensures unique values but allows NULL?**
- (a) PRIMARY KEY
- (b) **UNIQUE** ✓
- (c) NOT NULL
- (d) FOREIGN KEY

**Memory Trick:** UNIQUE = Can have NULL. PRIMARY KEY = Unique + NOT NULL.

**Key Point:** UNIQUE = Distinct values + Allows NULL. PK = Unique + NOT NULL

---

## 31. ALTER TABLE

**Q: What adds/modifies/drops columns?**
- (a) UPDATE TABLE
- (b) **ALTER TABLE** ✓
- (c) CHANGE TABLE
- (d) REDEFINE TABLE

**Memory Trick:** ALTER = Change structure. UPDATE = Change data.

**Key Point:** ALTER = Change structure. UPDATE = Change data

---

## 32. FOREIGN KEY CONSTRAINT

**Q: What enforces link between two tables?**
- (a) PRIMARY KEY
- (b) CHECK
- (c) NOT NULL
- (d) **FOREIGN KEY** ✓

**Memory Trick:** FOREIGN KEY = Links tables. Creates relationship.

**Key Point:** FOREIGN KEY = Enforces referential integrity (links tables)

---

## 33. CHECK CONSTRAINT

**Q: What restricts range of values in column?**
- (a) DOMAIN
- (b) **CHECK** ✓
- (c) RANGE
- (d) LIMIT

**Memory Trick:** CHECK = Check condition (e.g., Salary > 0).

**Key Point:** CHECK = Boolean condition (e.g., Age > 18)

---

## 34. WHERE CLAUSE

**Q: What filters rows before grouping?**
- (a) GROUP BY
- (b) HAVING
- (c) **WHERE** ✓
- (d) ORDER BY

**Memory Trick:** WHERE = Filter rows. HAVING = Filter groups.

**Key Point:** WHERE = Row filter (before GROUP BY). HAVING = Group filter (after GROUP BY)

---

## 35. DISTINCT KEYWORD

**Q: What eliminates duplicate rows?**
- (a) UNIQUE
- (b) TOP
- (c) **DISTINCT** ✓
- (d) SINGLE

**Memory Trick:** DISTINCT = Remove duplicates. UNIQUE = Constraint (not keyword).

**Key Point:** DISTINCT = Remove duplicate rows in result

---

## 36. AVG FUNCTION

**Q: What returns average of numeric column?**
- (a) SUM
- (b) **AVG** ✓
- (c) MEAN
- (d) COUNT

**Memory Trick:** AVG = Average. MEAN doesn't exist in SQL.

**Key Point:** AVG() = Arithmetic mean. SUM() = Total. COUNT() = Count rows

---

## 37. HAVING CLAUSE REQUIREMENT

**Q: What is required to use HAVING?**
- (a) WHERE
- (b) ORDER BY
- (c) **GROUP BY** ✓
- (d) FROM

**Memory Trick:** HAVING = Filter groups. Need groups first → GROUP BY required.

**Key Point:** HAVING requires GROUP BY (filters groups, not rows)

---

## 38. JOIN TYPES

**Q: Which is NOT a SQL join type?**
- (a) Inner Join
- (b) Outer Join
- (c) Cartesian Join
- (d) **Parallel Join** ✓

**Memory Trick:** Joins: Inner, Outer (Left/Right/Full), Cross. Parallel = Execution strategy, not join type.

**Key Point:** Join types: Inner, Outer, Cross. Parallel = Execution method (not join type)

---

## 39. CROSS JOIN RESULT

**Q: CROSS JOIN of Table-A (M rows) and Table-B (N rows) gives?**
- (a) M+N rows
- (b) **M×N rows (Cartesian product)** ✓
- (c) Min(M,N) rows
- (d) Only matching rows

**Memory Trick:** CROSS = Every row with every row = M×N.

**Key Point:** CROSS JOIN = Cartesian Product = M×N rows

---

## 40. COUNT FUNCTION

**Q: What counts all rows including NULL?**
- (a) COUNT(column_name)
- (b) **COUNT(*)** ✓
- (c) COUNT(DISTINCT column_name)
- (d) COUNT(NULL)

**Memory Trick:** COUNT(*) = Count all rows. COUNT(column) = Count non-NULL values.

**Key Point:** COUNT(*) = All rows. COUNT(column) = Non-NULL values only

---

## 41. LIKE OPERATOR

**Q: What performs pattern matching?**
- (a) =
- (b) **LIKE** ✓
- (c) MATCH
- (d) IN

**Memory Trick:** LIKE = Pattern match (%, _). = = Exact match.

**Key Point:** LIKE = Pattern matching (%, _ wildcards)

---

## 42. TRUNCATE TABLE

**Q: What removes all rows but keeps structure (faster than DELETE)?**
- (a) DROP TABLE
- (b) DELETE FROM table_name
- (c) CLEAR TABLE
- (d) **TRUNCATE TABLE** ✓

**Memory Trick:** TRUNCATE = Fast (DDL, no logging). DELETE = Slow (DML, logged).

**Key Point:** TRUNCATE = Fast, removes all data, keeps structure

---

## 43. ORDER BY DEFAULT

**Q: What is default ORDER BY when not specified?**
- (a) Descending
- (b) Random
- (c) **Ascending (ASC)** ✓
- (d) Reverse entry order

**Memory Trick:** Default = ASC (Ascending). Smallest to largest.

**Key Point:** ORDER BY default = ASC (ascending order)

---

## 44. COMMIT COMMAND

**Q: What makes transaction changes permanent?**
- (a) SAVE
- (b) ROLLBACK
- (c) **COMMIT** ✓
- (d) FINALIZE

**Memory Trick:** COMMIT = Save permanently. ROLLBACK = Undo.

**Key Point:** COMMIT = Make changes permanent. ROLLBACK = Undo changes

---

## 45. ROLLBACK COMMAND

**Q: What undoes changes since last COMMIT?**
- (a) REVERT
- (b) UNDO
- (c) **ROLLBACK** ✓
- (d) RESTORE

**Memory Trick:** ROLLBACK = Roll back to last commit point.

**Key Point:** ROLLBACK = Undo all changes since last COMMIT

---

## 46. VIEW DEFINITION

**Q: What is a View?**
- (a) Physical copy of table
- (b) Transaction record
- (c) **Virtual table based on SELECT query** ✓
- (d) Stored procedure

**Memory Trick:** View = Virtual (not stored). Based on query.

**Key Point:** View = Virtual table (stored SELECT statement, not physical data)

---

## 47. GRANT COMMAND

**Q: What gives user permission to access/modify objects?**
- (a) AUTHORIZE
- (b) PERMIT
- (c) **GRANT** ✓
- (d) ASSIGN

**Memory Trick:** GRANT = Give permission. REVOKE = Take permission.

**Key Point:** GRANT = Give privileges. REVOKE = Remove privileges

---

## 48. REVOKE COMMAND

**Q: What removes previously granted permission?**
- (a) **REVOKE** ✓
- (b) DENY
- (c) REMOVE
- (d) RECALL

**Memory Trick:** REVOKE = Opposite of GRANT.

**Key Point:** REVOKE = Remove privileges (opposite of GRANT)

---

## 49. NULL MEANING

**Q: What does NULL mean?**
- (a) Zero (0)
- (b) Empty string ("")
- (c) **Unknown/missing/not applicable** ✓
- (d) Primary key violation

**Memory Trick:** NULL = Unknown. Not zero, not empty string.

**Key Point:** NULL = Absence of value (unknown, missing, N/A)

---

## 50. IS NULL OPERATOR

**Q: How to check for NULL value?**
- (a) = NULL
- (b) **IS NULL** ✓
- (c) NULL CHECK
- (d) FIND NULL

**Memory Trick:** NULL is special. Use IS NULL (not = NULL).

**Key Point:** Check NULL: IS NULL or IS NOT NULL (NOT = NULL)

---

## 51. AS KEYWORD

**Q: What provides temporary alias for column/table?**
- (a) Define data type
- (b) Specify ordering
- (c) **Provide alias (alternative name)** ✓
- (d) Convert file format

**Memory Trick:** AS = Alias. Give temporary name.

**Key Point:** AS = Alias (temporary name for column/table/expression)

---

## 52. LIMIT CLAUSE

**Q: What returns only N records from beginning?**
- (a) FIRST N
- (b) **LIMIT N (or TOP N in SQL Server)** ✓
- (c) MAX ROWS N
- (d) RETURN N

**Memory Trick:** LIMIT = Limit number of rows. TOP = SQL Server version.

**Key Point:** LIMIT N = Return first N rows (TOP N in SQL Server)

---

## 53. INDEX PURPOSE

**Q: Why use indexes?**
- (a) Enforce constraints
- (b) Reduce storage
- (c) **Speed up data retrieval (SELECT)** ✓
- (d) Control concurrency

**Memory Trick:** Index = Book index. Helps find data quickly.

**Key Point:** Index = Fast lookup (avoids full table scan)

---

## 54. INDEX DISADVANTAGE

**Q: What is major disadvantage of indexes?**
- (a) Slow down retrieval
- (b) Consume memory
- (c) **Slow down INSERT/UPDATE/DELETE** ✓
- (d) Prevent foreign keys

**Memory Trick:** Index = Fast read, slow write (must update index too).

**Key Point:** Index = Fast SELECT, but slows INSERT/UPDATE/DELETE (must update index)

---

## 55. DENSE INDEX

**Q: What has index entry for every data record?**
- (a) Sparse Index
- (b) Primary Index
- (c) **Dense Index** ✓
- (d) Clustered Index

**Memory Trick:** Dense = Every record has entry. Sparse = Some entries only.

**Key Point:** Dense Index = Entry for every record. Sparse = Entry for some records

---

## 56. SPARSE INDEX

**Q: What has entries for only some records/blocks?**
- (a) Dense Index
- (b) Clustered Index
- (c) Secondary Index
- (d) **Sparse Index** ✓

**Memory Trick:** Sparse = Few entries (typically one per block).

**Key Point:** Sparse Index = Fewer entries (typically one per block)

---

## 57. PRIMARY INDEX DEFINITION

**Q: What is built on ordered file where search key is primary key?**
- (a) Primary Key
- (b) Non-key attribute
- (c) **Primary Key, file ordered on this key** ✓
- (d) Small data type

**Memory Trick:** Primary Index = On primary key + File is sorted by this key.

**Key Point:** Primary Index = On primary key + Data file sorted by this key

---

## 58. CLUSTERED INDEX CHARACTERISTIC

**Q: What is key feature of Clustered Index?**
- (a) Must be on non-key unique attribute
- (b) Includes entire attribute set
- (c) **Physical order = Logical order of index key** ✓
- (d) Can be on non-contiguous columns

**Memory Trick:** Clustered = Data physically ordered by index key.

**Key Point:** Clustered Index = Physical data order matches index key order

---

## 59. PRIMARY INDEX COUNT

**Q: How many Primary Indexes per table?**
- (a) Zero
- (b) **Exactly one** ✓
- (c) Up to candidate keys
- (d) Unlimited

**Memory Trick:** Primary = One. Data can only be sorted one way physically.

**Key Point:** Primary Index = One per table (data sorted one way only)

---

## 60. PRIMARY vs SECONDARY INDEX

**Q: What is main difference?**
- (a) Primary unique, secondary not
- (b) **Primary orders data file; secondary does not** ✓
- (c) Primary dense, secondary sparse
- (d) Primary on one field, secondary on multiple

**Memory Trick:** Primary = Orders file. Secondary = Alternative access path.

**Key Point:** Primary Index = Determines physical order. Secondary = Alternative path (file not ordered by it)

---

## 61. SECONDARY INDEX

**Q: What is built on non-ordering attribute (always dense)?**
- (a) Primary Index
- (b) Clustered Index
- (c) **Secondary Index** ✓
- (d) Sparse Index

**Memory Trick:** Secondary = Not the ordering key. Must be dense (file not sorted).

**Key Point:** Secondary Index = On non-ordering attribute + Always dense

---

## 62. MULTI-LEVEL INDEX PURPOSE

**Q: Why use multi-level index?**
- (a) Handle multiple disks
- (b) Reduce leaf nodes
- (c) **Speed up searching within large index** ✓
- (d) Enable different isolation levels

**Memory Trick:** Multi-level = Index on index. Faster search in large index.

**Key Point:** Multi-level Index = Index on index (reduces disk I/O for large indexes)

---

## 63. MULTI-LEVEL INDEX BOTTOM

**Q: What is bottom-most level of multi-level index?**
- (a) Root index block
- (b) **Sparse index of data file** ✓
- (c) Actual data file
- (d) Clustered index

**Memory Trick:** Bottom = Data file index. Top = Index on index.

**Key Point:** Multi-level: Bottom = Index on data file. Higher levels = Index on index

---

## 64. MULTI-LEVEL INDEX STRUCTURE

**Q: What structure implements multi-level index?**
- (a) Hash Table
- (b) Linked List
- (c) **B-Tree or B+ Tree** ✓
- (d) Heap File

**Memory Trick:** B-Tree = Balanced tree. Perfect for multi-level.

**Key Point:** Multi-level Index = B-Tree or B+ Tree structure

---

## 65. B-TREE DATA POINTERS

**Q: Where are data pointers in B-Tree?**
- (a) Only leaf nodes
- (b) Only second level
- (c) **Root, internal, and leaf nodes** ✓
- (d) Only root

**Memory Trick:** B-Tree = Data pointers everywhere. B+ Tree = Data pointers only in leaves.

**Key Point:** B-Tree = Data pointers in all nodes. B+ Tree = Data pointers only in leaves

---

## 66. B+ TREE PREFERRED

**Q: Why prefer B+ Tree for RDBMS?**
- (a) B-Tree
- (b) **B+ Tree** ✓
- (c) Hash Index
- (d) Multi-level Sequential

**Memory Trick:** B+ Tree = Better for range queries (leaf nodes linked).

**Key Point:** B+ Tree = Preferred (efficient range queries, all data in leaves)

---

## 67. B+ TREE DATA POINTERS

**Q: Where are data pointers in B+ Tree?**
- (a) Internal nodes
- (b) Root node
- (c) **Leaf nodes only** ✓
- (d) Index blocks

**Memory Trick:** B+ Tree = All data in leaves. Leaves linked sequentially.

**Key Point:** B+ Tree = Data pointers only in leaf nodes (linked sequentially)

---

## 68. UNIQUE INDEX

**Q: What is index on attribute with distinct values?**
- (a) Non-Unique Index
- (b) **Unique Index** ✓
- (c) Clustered Index
- (d) Sparse Index

**Memory Trick:** Unique = All values different. Can be on PK or unique attribute.

**Key Point:** Unique Index = On attribute with distinct values (can be PK or unique column)

---

## 69. FAN-OUT

**Q: What is fan-out (branching factor)?**
- (a) Total leaf nodes
- (b) Minimum entries per node
- (c) **Maximum child pointers in node** ✓
- (d) Tree depth

**Memory Trick:** Fan-out = How many children per node. Higher = Shorter tree.

**Key Point:** Fan-out = Maximum children per node (higher = better performance)

---

## 70. B+ TREE ADVANTAGE

**Q: Why is B+ Tree better than B-Tree?**
- (a) Less memory
- (b) **Higher branching factor (fan-out)** ✓
- (c) Random data storage
- (d) Never needs rebalancing

**Memory Trick:** B+ Tree = Internal nodes have only keys (no data) → More keys per node → Higher fan-out.

**Key Point:** B+ Tree = Higher fan-out (internal nodes store keys only, not data pointers)

---

## 71. UNORDERED FILE INDEX

**Q: If file not ordered by search key, what index type needed?**
- (a) Unordered Index
- (b) **Dense Index** ✓
- (c) Hash Index
- (d) Block Index

**Memory Trick:** Unordered file = Can't use sparse (don't know which block). Must be dense.

**Key Point:** Unordered file = Must use Dense Index (can't use Sparse)

---

## 72. E-R MODEL PURPOSE

**Q: What is E-R model's primary purpose?**
- (a) Define physical storage
- (b) **High-level conceptual blueprint** ✓
- (c) Specify SQL queries
- (d) Enforce integrity

**Memory Trick:** E-R = Entity-Relationship. Conceptual design (not physical).

**Key Point:** E-R Model = Conceptual design (high-level, before implementation)

---

## 73. ENTITY TYPE SYMBOL

**Q: What shape represents Entity Type?**
- (a) Oval/Ellipse
- (b) Diamond
- (c) **Rectangle/Square** ✓
- (d) Double Rectangle

**Memory Trick:** Entity = Rectangle. Relationship = Diamond. Attribute = Oval.

**Key Point:** Entity = Rectangle. Relationship = Diamond. Attribute = Oval

---

## 74. MULTIVALUED ATTRIBUTE

**Q: What is represented by double ellipse?**
- (a) Key Attribute
- (b) Composite Attribute
- (c) **Multivalued Attribute** ✓
- (d) Derived Attribute

**Memory Trick:** Double ellipse = Multiple values (e.g., multiple phone numbers).

**Key Point:** Multivalued Attribute = Double ellipse (entity can have multiple values)

---

## 75. CARDINALITY CONSTRAINTS

**Q: What defines min/max associations between entities?**
- (a) Structural Constraints
- (b) Participation Constraints
- (c) **Cardinality Constraints** ✓
- (d) Domain Constraints

**Memory Trick:** Cardinality = How many (1:1, 1:N, M:N).

**Key Point:** Cardinality = Maximum associations (1:1, 1:N, M:N)

---

## 76. TOTAL PARTICIPATION

**Q: What means every entity must participate in relationship?**
- (a) **Total Participation** ✓
- (b) Partial Participation
- (c) One-to-One
- (d) Mandatory Referential Integrity

**Memory Trick:** Total = All must participate (double line). Partial = Some may not (single line).

**Key Point:** Total Participation = Double line (all entities participate). Partial = Single line

---

## 77. RECURSIVE RELATIONSHIP

**Q: What is relationship where same entity type relates to itself?**
- (a) Ternary
- (b) Self-Referencing
- (c) **Recursive Relationship** ✓
- (d) Specialized

**Memory Trick:** Recursive = Entity relates to itself (e.g., employee supervises employee).

**Key Point:** Recursive Relationship = Same entity type related to itself

---

## 78. TERNARY RELATIONSHIP

**Q: What is relationship involving 3 entities?**
- (a) Binary
- (b) Multiplicity
- (c) Hierarchical
- (d) **Ternary (or n-ary)** ✓

**Memory Trick:** Ternary = 3 entities. N-ary = N entities.

**Key Point:** Ternary = 3 entities. N-ary = N entities

---

## 79. 1:N RELATIONSHIP

**Q: In 1:N from E1 to E2, what is true?**
- (a) E1→many E2, E2→many E1
- (b) E1→many E2, E2→many E1
- (c) **E1→many E2, E2→at most one E1** ✓
- (d) Must have total participation

**Memory Trick:** 1:N = One to Many. One side → Many. Many side → One.

**Key Point:** 1:N = One entity → Many entities. Many entities → One entity

---

## 80. KEY ATTRIBUTE SYMBOL

**Q: What is attribute with single underline?**
- (a) **Key Attribute (Primary)** ✓
- (b) Partial Key
- (c) Multivalued
- (d) Identifying

**Memory Trick:** Single underline = Primary key. Double underline = Partial key (weak entity).

**Key Point:** Single underline = Primary key. Double underline = Partial key

---

## 81. DERIVED ATTRIBUTE

**Q: What can be calculated from other attributes?**
- (a) Composite
- (b) **Derived** ✓
- (c) Multivalued
- (d) Stored

**Memory Trick:** Derived = Calculated (e.g., Age from BirthDate). Dashed ellipse.

**Key Point:** Derived Attribute = Calculated (dashed ellipse, e.g., Age from BirthDate)

---

## 82. SIMPLE ATTRIBUTE

**Q: In composite Address, what is simple?**
- (a) Street Address
- (b) Full Address
- (c) **ZipCode** ✓
- (d) City_State

**Memory Trick:** Simple = Atomic (can't be divided). ZipCode = Single value.

**Key Point:** Simple Attribute = Atomic (cannot be subdivided)

---

## 83. GENERALIZATION/SPECIALIZATION

**Q: What principle do Generalization/Specialization use?**
- (a) Aggregation
- (b) Abstraction
- (c) **Inheritance** ✓
- (d) Modularity

**Memory Trick:** Generalization/Specialization = ISA hierarchy. Inheritance = Subclass gets superclass properties.

**Key Point:** Generalization/Specialization = Based on Inheritance (ISA relationship)

---

## 84. MULTIVALUED ATTRIBUTE MAPPING

**Q: What maps to separate table in E-R to relational?**
- (a) **Multivalued Attribute** ✓
- (b) 1:N Relationship
- (c) Total Participation
- (d) Simple Attribute

**Memory Trick:** Multivalued = Violates 1NF (atomic values). Needs separate table.

**Key Point:** Multivalued Attribute = Separate table (violates 1NF if stored in main table)

---

## 85. WEAK ENTITY IDENTIFYING RELATIONSHIP

**Q: What links weak entity to identifying entity?**
- (a) 1:1
- (b) M:N
- (c) **1:N from identifying to weak** ✓
- (d) N:1

**Memory Trick:** Weak entity = Depends on strong. Identifying relationship = 1:N (one strong → many weak).

**Key Point:** Weak Entity identifying relationship = 1:N (strong → weak)

---

## 86. WEAK ENTITY CHARACTERISTIC

**Q: What defines weak entity?**
- (a) Cannot participate in relationships
- (b) No candidate keys
- (c) **No primary key of own (depends on strong entity)** ✓
- (d) Must be 1:1

**Memory Trick:** Weak = No identity alone. Needs strong entity's PK + partial key.

**Key Point:** Weak Entity = No PK alone (needs strong entity's PK + partial key)

---

## 87. RELATIONAL ALGEBRA SELECTION

**Q: What selects subset of tuples satisfying condition?**
- (a) Projection
- (b) Union
- (c) **Selection (σ)** ✓
- (d) Cartesian Product

**Memory Trick:** Selection = Filter rows (WHERE clause). σ = Sigma (select).

**Key Point:** Selection (σ) = Filter rows (horizontal subset)

---

## 88. RELATIONAL ALGEBRA PROJECTION

**Q: What eliminates columns (vertical subset)?**
- (a) Selection
- (b) Intersection
- (c) **Projection (π)** ✓
- (d) Difference

**Memory Trick:** Projection = Select columns (SELECT clause). π = Pi (project).

**Key Point:** Projection (π) = Select columns (vertical subset)

---

## 89. RELATIONAL ALGEBRA UNION

**Q: What returns tuples in R or S or both (no duplicates)?**
- (a) All tuples in R or S with duplicates
- (b) Common tuples
- (c) **All tuples in R or S or both, duplicates eliminated** ✓
- (d) R but not S

**Memory Trick:** Union = Combine (like set union). No duplicates (relations are sets).

**Key Point:** Union (∪) = All tuples from R or S (duplicates removed)

---

## 90. FUNDAMENTAL OPERATIONS

**Q: What is minimal set of relational algebra operations?**
- (a) σ, π, ∪, ×, ∩
- (b) **σ, π, ∪, ×, ρ (Selection, Projection, Union, Cartesian Product, Rename)** ✓
- (c) σ, π, ∩, ×, ρ
- (d) σ, π, ÷, ×, ρ

**Memory Trick:** Fundamental = Can derive all others. σ, π, ∪, ×, ρ = Minimal set.

**Key Point:** Fundamental operations: σ, π, ∪, ×, ρ (can derive all others)

---

## 91. UNION COMPATIBLE

**Q: What is requirement for R and S to be union compatible?**
- (a) Same number of tuples
- (b) Same attributes
- (c) **Same number of attributes + Same domains** ✓
- (d) Common attribute

**Memory Trick:** Union compatible = Same structure (same columns, same types).

**Key Point:** Union Compatible = Same arity (columns) + Same domains (data types)

---

## 92. CARTESIAN PRODUCT TUPLES

**Q: R (M tuples) × S (N tuples) = ?**
- (a) M+N
- (b) **M×N** ✓
- (c) Min(M,N)
- (d) Max(M,N)

**Memory Trick:** Cartesian Product = Every with every = M×N.

**Key Point:** Cartesian Product (×) = M×N tuples (every tuple of R with every tuple of S)

---

## 93. UNION vs INTERSECTION

**Q: Which is always true for union compatible R and S?**
- (a) R∪S = R∩S
- (b) R∩S = R-(R∪S)
- (c) **(R∩S) ⊆ (R∪S)** ✓
- (d) R×S = R∪S

**Memory Trick:** Intersection = Common. Union = All. Common ⊆ All.

**Key Point:** Intersection ⊆ Union (common tuples are subset of all tuples)

---

## 94. NATURAL JOIN DERIVATION

**Q: How is Natural Join derived?**
- (a) σ then π on R×S
- (b) π then R∪S
- (c) **R×S then σ (on common attributes) then π (remove duplicates)** ✓
- (d) R×S then σ then π

**Memory Trick:** Natural Join = Cartesian Product + Select (common attributes equal) + Project (remove duplicate columns).

**Key Point:** Natural Join = Cartesian Product + Selection (common attributes) + Projection (remove duplicates)

---

## 95. SET DIFFERENCE

**Q: What returns tuples in R but not in S?**
- (a) Intersection
- (b) **Set Difference (R-S)** ✓
- (c) Division
- (d) Theta Join

**Memory Trick:** Difference = R - S (subtract). Like set difference.

**Key Point:** Set Difference (R-S) = Tuples in R but not in S

---

## 96. THETA JOIN vs EQUIJOIN

**Q: How does Theta Join differ from Equijoin?**
- (a) Includes all attributes
- (b) **Theta allows any comparison (>,<,=); Equijoin only =** ✓
- (c) Theta = Natural Join
- (d) Theta is outer, Equijoin is inner

**Memory Trick:** Theta = Any condition (θ). Equijoin = Only equality (=).

**Key Point:** Theta Join = Any comparison operator. Equijoin = Only equality

---

## 97. INTERSECTION EXPRESSION

**Q: What expression equals R∩S?**
- (a) **R - (R-S)** ✓
- (b) (R-S)∪(S-R)
- (c) R∪S - (R∩S)
- (d) R×S - σcondition(R×S)

**Memory Trick:** Intersection = R minus (R minus S). R - (R - S) = Common.

**Key Point:** Intersection (R∩S) = R - (R-S) (using set difference)

---

## 98. LEFT OUTER JOIN

**Q: What does Left Outer Join ensure?**
- (a) All tuples from both
- (b) All from right (S)
- (c) **All from left (R), even if no match in S** ✓
- (d) Only matching

**Memory Trick:** Left Outer = Keep all left rows. NULL for unmatched right.

**Key Point:** Left Outer Join = All tuples from R + Matching from S (NULL if no match)

---

## 99. DIVISION OPERATION

**Q: What finds entities in R related to ALL entities in S?**
- (a) Natural Join
- (b) Cartesian Product
- (c) **Division (÷)** ✓
- (d) Intersection

**Memory Trick:** Division = "For all" queries (e.g., customers who bought ALL products).

**Key Point:** Division (÷) = "For all" queries (R÷S = tuples in R related to all in S)

---

## 100. ASSOCIATIVITY

**Q: Which operations are associative?**
- (a) **Both Cartesian Product and Natural Join** ✓
- (b) Neither
- (c) Only Cartesian Product
- (d) Only Natural Join

**Memory Trick:** Associative = (R op S) op T = R op (S op T). Both × and ⋈ are associative.

**Key Point:** Both Cartesian Product (×) and Natural Join (⋈) are associative

---

## 101. CLOSED PROPERTY

**Q: What does "closed" mean in relational algebra?**
- (a) Result is empty set
- (b) Operations can't be combined
- (c) **Input = Relation, Output = Relation** ✓
- (d) Must execute without errors

**Memory Trick:** Closed = Output is same type as input (relation → relation).

**Key Point:** Closed = Result of operation is always a relation (can chain operations)

---

## 102. PROCEDURAL LANGUAGE

**Q: Why is relational algebra procedural?**
- (a) Specifies what, not how
- (b) **Specifies how (sequence of operations)** ✓
- (c) Based on logic, not steps
- (d) Only on stored data

**Memory Trick:** Procedural = How to do it (steps). Declarative = What you want (SQL).

**Key Point:** Relational Algebra = Procedural (specify steps). SQL = Declarative (specify what)

---

## 103. TRANSACTION DEFINITION

**Q: What is a Transaction?**
- (a) Single SQL query
- (b) Record of changes
- (c) **Logical unit of work (all or nothing)** ✓
- (d) User request handler

**Memory Trick:** Transaction = All or nothing. Either all succeed or all fail.

**Key Point:** Transaction = Atomic unit (all operations succeed or all fail)

---

## 104. TRANSACTION BOUNDARIES

**Q: What marks transaction completion?**
- (a) OPEN/CLOSE
- (b) READ/WRITE
- (c) START/FINISH
- (d) **COMMIT/ROLLBACK** ✓

**Memory Trick:** COMMIT = Success (save). ROLLBACK = Failure (undo).

**Key Point:** Transaction ends with COMMIT (success) or ROLLBACK (failure)

---

## 105. ATOMICITY

**Q: What does Atomicity ensure?**
- (a) Multiple transactions don't interfere
- (b) Database constraints preserved
- (c) **Transaction is all-or-nothing** ✓
- (d) Results permanent

**Memory Trick:** Atomic = Indivisible. All or nothing.

**Key Point:** Atomicity = All operations succeed or all fail (no partial execution)

---

## 106. DURABILITY

**Q: What ensures committed changes survive crashes?**
- (a) Atomicity
- (b) Consistency
- (c) Isolation
- (d) **Durability** ✓

**Memory Trick:** Durable = Permanent. Survives crashes.

**Key Point:** Durability = Committed changes are permanent (survive system failures)

---

## 107. CONSISTENCY

**Q: What does Consistency ensure?**
- (a) Same data throughout
- (b) Same speed
- (c) **Database moves from one valid state to another** ✓
- (d) Files contiguous

**Memory Trick:** Consistent = Valid state. All constraints satisfied.

**Key Point:** Consistency = Transaction preserves database constraints (valid state → valid state)

---

## 108. ISOLATION

**Q: What does Isolation ensure?**
- (a) Only authorized access
- (b) Auto-lock all data
- (c) Transaction atomic
- (d) **Concurrent transactions execute independently** ✓

**Memory Trick:** Isolation = Transactions don't see each other's intermediate results.

**Key Point:** Isolation = Concurrent transactions don't interfere (as if running alone)

---

## 109. SCHEDULE DEFINITION

**Q: What is a Schedule?**
- (a) Order transactions submitted
- (b) Sequence of log records
- (c) **Sequence of interleaved operations of concurrent transactions** ✓
- (d) Execution plan for single query

**Memory Trick:** Schedule = Timeline of operations from multiple transactions.

**Key Point:** Schedule = Order of execution of operations from multiple transactions

---

## 110. SERIAL SCHEDULE

**Q: What is Serial Schedule?**
- (a) Transactions sequential but order changes
- (b) **All operations of one transaction complete before next starts** ✓
- (c) Operations interleaved only for reads
- (d) Leads to consistent state

**Memory Trick:** Serial = One at a time. Complete T1, then T2.

**Key Point:** Serial Schedule = Transactions execute one after another (no interleaving)

---

## 111. CONCURRENT SCHEDULE

**Q: What characterizes Concurrent Schedule?**
- (a) All on different CPUs
- (b) Results in consistent state
- (c) **Operations of multiple transactions interleaved** ✓
- (d) Only one active at a time

**Memory Trick:** Concurrent = Interleaved. Operations from different transactions mixed.

**Key Point:** Concurrent Schedule = Operations from multiple transactions interleaved

---

## 112. SERIALIZABLE

**Q: When is schedule Serializable?**
- (a) Only COMMIT/ROLLBACK
- (b) No deadlock
- (c) **Same result as some serial schedule** ✓
- (d) Uses two-phase locking

**Memory Trick:** Serializable = Equivalent to serial execution (correct result).

**Key Point:** Serializable = Produces same result as some serial execution

---

## 113. CONCURRENT SCHEDULE BENEFIT

**Q: Why allow concurrent schedules?**
- (a) Guarantee consistency
- (b) Simplify protocols
- (c) **Increase throughput and resource utilization** ✓
- (d) Ensure atomicity

**Memory Trick:** Concurrent = Better performance (overlap I/O, use CPU better).

**Key Point:** Concurrent = Better performance (overlaps I/O, better CPU utilization)

---

## 114. TWO-PHASE LOCKING

**Q: What does 2PL guarantee?**
- (a) Serializable
- (b) Conflict-free
- (c) Deadlock-free
- (d) **Conflict Serializable** ✓

**Memory Trick:** 2PL = Guarantees conflict serializability (correct concurrent execution).

**Key Point:** 2PL = Guarantees Conflict Serializable schedule

---

## 115. 2PL PHASES

**Q: What are the two phases of 2PL?**
- (a) Read/Write
- (b) **Growing/Shrinking** ✓
- (c) Read/Validation
- (d) Lock Acquisition/Unlock

**Memory Trick:** Growing = Acquire locks. Shrinking = Release locks.

**Key Point:** 2PL Phases: Growing (acquire locks) + Shrinking (release locks)

---

## 116. 2PL DISADVANTAGE

**Q: What is key disadvantage of 2PL?**
- (a) Deadlocks
- (b) Starvation
- (c) Unrepeatable Reads
- (d) **Potential for Deadlocks** ✓

**Memory Trick:** 2PL = Can cause deadlock (circular wait for locks).

**Key Point:** 2PL = May cause deadlocks (transactions waiting for each other)

---

## 117. EXCLUSIVE LOCK CONFLICT

**Q: If T1 has Exclusive lock on X, what can T2 get?**
- (a) Shared lock
- (b) Exclusive lock
- (c) Update lock
- (d) **No lock (must wait)** ✓

**Memory Trick:** Exclusive = No one else can lock. T2 must wait.

**Key Point:** Exclusive Lock = No other transaction can acquire any lock (must wait)

---

## 118. CASCADING ROLLBACK

**Q: What is cascading rollback?**
- (a) Non-recoverable
- (b) Conflict Serializable
- (c) **Rollback of one causes rollback of others** ✓
- (d) Non-isolated

**Memory Trick:** Cascade = Domino effect. One rollback triggers others.

**Key Point:** Cascading Rollback = One transaction's rollback forces others to rollback

---

## 119. RECOVERABLE SCHEDULE

**Q: When is schedule Recoverable?**
- (a) Conflict serializable
- (b) No cascading rollbacks
- (c) **T_i commits only after all transactions that wrote data read by T_i have committed** ✓
- (d) Uses crash-proof logging

**Memory Trick:** Recoverable = Don't commit until dependencies committed.

**Key Point:** Recoverable = Transaction commits only after all transactions it read from have committed

---

## 120. PRECEDENCE GRAPH CYCLE

**Q: If schedule NOT conflict serializable, graph has?**
- (a) Isolated node
- (b) Multiple edges
- (c) **Cycle** ✓
- (d) Exactly two nodes

**Memory Trick:** Cycle = Circular dependency = Not serializable.

**Key Point:** Not Conflict Serializable = Precedence graph has cycle

---

## 121. ISOLATION LEVELS

**Q: What is highest isolation level (prevents all anomalies)?**
- (a) Read Committed
- (b) Repeatable Read
- (c) **Serializable** ✓
- (d) Read Uncommitted

**Memory Trick:** Serializable = Highest (prevents dirty read, unrepeatable read, phantom read).

**Key Point:** Serializable = Highest isolation (prevents all three anomalies)

---

## 122. CLUSTERING INDEX

**Q: What is index where data order matches index order?**
- (a) Secondary
- (b) Multi-level
- (c) **Primary Index** ✓
- (d) Sparse

**Memory Trick:** Clustering = Data clustered (ordered) by index key.

**Key Point:** Clustering Index = Physical data order matches index key order

---

## 123. CLUSTERING INDEX ON NON-KEY

**Q: Can Clustering Index be on non-key field?**
- (a) True (allows grouping)
- (b) False (must be PK)
- (c) **False (can be on any ordering field, key or non-key)** ✓
- (d) True (only non-key)

**Memory Trick:** Clustering = On field that orders data (can be key or non-key).

**Key Point:** Clustering Index = Can be on any field used to order data (key or non-key)

---

## 124. SPARSE INDEX ENTRY

**Q: When is sparse index entry created?**
- (a) Every record
- (b) Every non-NULL
- (c) **First record in each block/cluster** ✓
- (d) Only primary key values

**Memory Trick:** Sparse = Few entries (typically one per block).

**Key Point:** Sparse Index = Entry for first record of each block/cluster

---

## 125. DENSE INDEX ADVANTAGE

**Q: Why use Dense over Sparse?**
- (a) Less storage
- (b) Faster sequential scan
- (c) **Faster direct lookup (no block scan needed)** ✓
- (d) Better variable-length handling

**Memory Trick:** Dense = Direct pointer to record. Sparse = May need block scan.

**Key Point:** Dense Index = Direct record access (no sequential block scan)

---

## 126. SECONDARY INDEX NON-UNIQUE

**Q: If secondary key non-unique, index entry contains?**
- (a) Key + single pointer
- (b) Sparse entry
- (c) **List of pointers to all matching records** ✓
- (d) Pointer to first block

**Memory Trick:** Non-unique = Multiple records per key. Need list of pointers.

**Key Point:** Non-unique Secondary Index = Entry contains key + list of pointers to all matching records

---

## 127. MULTI-LEVEL INDEX REASON

**Q: Why use multi-level index?**
- (a) Multiple fields indexed
- (b) **Reduce disk I/O for large index** ✓
- (c) Multiple physical orderings
- (d) Varying record sizes

**Memory Trick:** Multi-level = Index on index. Faster search in large index.

**Key Point:** Multi-level Index = Reduces disk I/O (index on index, hierarchical search)

---

## 128. MULTI-LEVEL INDEX MEMORY

**Q: Which level must be in memory?**
- (a) All levels
- (b) Lowest level
- (c) **Highest level (root)** ✓
- (d) Only leaf pointers

**Memory Trick:** Root in memory = Fast start. Can fetch other levels as needed.

**Key Point:** Multi-level Index = Root (highest level) should be in memory

---

## 129. B+ TREE LEAF LINKING

**Q: Why are B+ Tree leaves linked?**
- (a) Faster insertion
- (b) **Efficient range queries** ✓
- (c) Reduce height
- (d) Balance tree

**Memory Trick:** Linked leaves = Sequential scan. Perfect for range queries.

**Key Point:** B+ Tree = Leaf nodes linked sequentially (efficient range queries)

---

## 130. DATA POINTERS IN B-TREE

**Q: Where are data pointers in B-Tree?**
- (a) Only leaf nodes
- (b) Only second level
- (c) **Root, internal, and leaf nodes** ✓
- (d) Only root

**Memory Trick:** B-Tree = Data pointers everywhere. B+ Tree = Only in leaves.

**Key Point:** B-Tree = Data pointers in all nodes. B+ Tree = Data pointers only in leaves

---

## 131. PRIMARY vs SECONDARY INDEX

**Q: What is main difference?**
- (a) Primary unique, secondary not
- (b) **Primary orders file; secondary does not** ✓
- (c) Primary dense, secondary sparse
- (d) Primary one field, secondary multiple

**Memory Trick:** Primary = Determines physical order. Secondary = Alternative access path.

**Key Point:** Primary Index = Determines physical file order. Secondary = Alternative path (file not ordered by it)

---

## 132. HORIZONTAL FRAGMENTATION

**Q: What must hold for horizontal fragmentation?**
- (a) Transparency, minimality
- (b) Completeness, minimality, replication
- (c) Replication, transparency
- (d) **Completeness, reconstruction, disjointness** ✓

**Memory Trick:** Fragmentation = Split data. Must be: Complete (all data), Reconstructible (can join back), Disjoint (no overlap).

**Key Point:** Horizontal Fragmentation = Complete + Reconstructible + Disjoint

---

## 133. SELECTION OPERATOR

**Q: What does σ Age>18 (Students) do?**
- (a) Removes Age column
- (b) **Keeps only tuples with Age > 18** ✓
- (c) Groups by age
- (d) Sorts by age

**Memory Trick:** σ = Selection = Filter rows (WHERE clause).

**Key Point:** Selection (σ) = Filters rows based on condition

---

## 134. NATURAL JOIN

**Q: What does natural join do automatically?**
- (a) Removes duplicates
- (b) **Joins on attributes with same name** ✓
- (c) Cartesian product only
- (d) Requires foreign key

**Memory Trick:** Natural = Automatic join on common attribute names.

**Key Point:** Natural Join = Automatically joins on attributes with same name

---

## 135. ACID PROPERTIES

**Q: Which is TRUE about ACID?**
- (a) Durability = temporary
- (b) **Isolation prevents interference** ✓
- (c) Atomicity by indexes
- (d) Consistency optional

**Memory Trick:** Isolation = Transactions don't see each other's work.

**Key Point:** Isolation = Prevents concurrent transactions from interfering

---

## 136. B+ TREE PROPERTIES

**Q: What is TRUE for B+ Trees?**
- (a) Data in internal nodes
- (b) **All leaves at same level** ✓
- (c) May become unbalanced
- (d) Search all nodes

**Memory Trick:** B+ Tree = Balanced (all leaves same depth). Self-balancing.

**Key Point:** B+ Tree = Height-balanced (all leaf nodes at same level)

---

## 137. SPARSE INDEX SIZE

**Q: Why is sparse index smaller?**
- (a) Uses hashing
- (b) Only leaf entries
- (c) Only unique keys
- (d) **Stores subset of search-key values** ✓

**Memory Trick:** Sparse = Few entries (one per block typically). Dense = Every record.

**Key Point:** Sparse Index = Stores only subset of key values (typically one per block)

---

## 138. WRITE-AHEAD LOGGING

**Q: What may be violated if logs written after data?**
- (a) **Atomicity** ✓
- (b) Isolation
- (c) Durability
- (d) Consistency

**Memory Trick:** Write log first! If crash after data write but before log, can't rollback → Atomicity violated.

**Key Point:** Write-Ahead Logging = Write log before data (ensures atomicity on crash)

---

## 139. NATURAL JOIN REQUIREMENT

**Q: What is required for R(A,B) ☑ S(B,C)?**
- (a) Always all combinations
- (b) **Matching domains for join attributes** ✓
- (c) Discards unless key constraints
- (d) Identical to R×S

**Memory Trick:** Natural join = Common attributes must have compatible types.

**Key Point:** Natural Join = Requires matching attribute names + compatible domains

---

## 140. MULTI-LEVEL INDEX MEMORY

**Q: Which level must be in memory?**
- (a) All levels
- (b) Lowest
- (c) **Highest (root)** ✓
- (d) Only leaf pointers

**Memory Trick:** Root in memory = Fast search start.

**Key Point:** Multi-level Index = Root should be in memory for fast access

---

## 141. 1:N TOTAL PARTICIPATION

**Q: If Employee has total participation in 1:N with Department, what is mapping?**
- (a) Department references Employee
- (b) **Employee references Department** ✓
- (c) Both reference each other
- (d) Separate relationship table

**Memory Trick:** 1:N + Total on N-side = Foreign key on many-side (Employee).

**Key Point:** 1:N with total participation on N-side = FK on many-side table

---

## 142. WEAK ENTITY MAPPING

**Q: How is weak entity OrderItem (partial key ItemNo, depends on Order) mapped?**
- (a) **Composite key (OrderID, ItemNo)** ✓
- (b) Primary key ItemNo only
- (c) Order table stores ItemNo
- (d) Separate relationship table mandatory

**Memory Trick:** Weak entity = Needs owner's PK + partial key = Composite PK.

**Key Point:** Weak Entity = Composite primary key (owner's PK + partial key)

---

## 143. TERNARY RELATIONSHIP

**Q: How to represent ternary relationship (Student, Course, Instructor)?**
- (a) Student and Course only
- (b) R(StudentID, CourseID, InstructorID)
- (c) Three binary relationships
- (d) **Separate relationship table with all participant keys** ✓

**Memory Trick:** Ternary = 3 entities. Need separate table with all 3 foreign keys.

**Key Point:** Ternary Relationship = Separate table with all participant foreign keys

---

## 144. NATURAL JOIN vs CARTESIAN PRODUCT

**Q: Is natural join same as Cartesian product?**
- (a) Yes, always
- (b) **No, natural join requires matching attributes** ✓
- (c) Yes, if no common attributes
- (d) No, natural join is outer join

**Memory Trick:** Natural join = Cartesian product + selection + projection. Not same.

**Key Point:** Natural Join ≠ Cartesian Product (natural join filters on common attributes)

---

## QUICK REFERENCE - MEMORY TRICKS SUMMARY

### Three Schema Architecture
- **External** = User's view (simplified)
- **Logical/Conceptual** = What data (structure)
- **Physical/Internal** = How stored (files, indexes)

### Keys
- **Super Key** = Unique (may have extras)
- **Candidate Key** = Unique + Minimal
- **Primary Key** = Chosen candidate key
- **Foreign Key** = References another table's PK

### Indexes
- **Primary** = On ordering key (one per table)
- **Secondary** = On non-ordering attribute (always dense)
- **Dense** = Entry for every record
- **Sparse** = Entry for some records (typically one per block)
- **Clustered** = Physical order matches index order

### SQL Commands
- **DDL** = CREATE, ALTER, DROP (structure)
- **DML** = SELECT, INSERT, UPDATE, DELETE (data)
- **DCL** = GRANT, REVOKE (permissions)
- **TCL** = COMMIT, ROLLBACK (transactions)

### ACID Properties
- **Atomicity** = All or nothing
- **Consistency** = Valid state → Valid state
- **Isolation** = Transactions don't interfere
- **Durability** = Committed changes permanent

### Relational Algebra
- **σ (Selection)** = Filter rows (WHERE)
- **π (Projection)** = Select columns (SELECT)
- **∪ (Union)** = Combine (OR)
- **× (Cartesian Product)** = Every with every
- **⋈ (Natural Join)** = Join on common attributes

### E-R Model
- **Entity** = Rectangle
- **Relationship** = Diamond
- **Attribute** = Oval
- **Key Attribute** = Single underline
- **Partial Key** = Double underline
- **Multivalued** = Double ellipse
- **Derived** = Dashed ellipse

---

## EXAM TIPS

1. **Three Levels**: External (user) → Logical (structure) → Physical (storage)
2. **Keys**: Super (unique) → Candidate (unique+minimal) → Primary (chosen)
3. **Indexes**: Primary (orders file) vs Secondary (alternative path)
4. **SQL**: DDL (structure), DML (data), DCL (permissions), TCL (transactions)
5. **ACID**: All-or-nothing, Valid states, Independent, Permanent
6. **Joins**: Inner (matching), Outer (all from one side), Cross (all combinations)
7. **Normalization**: 3NF (safe), BCNF (may lose dependencies)

---

**Good Luck with Your Exam! 🎯**
