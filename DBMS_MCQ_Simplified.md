# DBMS MCQs - Simplified & Easy to Remember

## SECTION 1: DATABASE BASICS

### Q1: What is a Database?
**Simple Question:** Database is a _____?
- ❌ Collection of programs
- ✅ **Structured collection of interrelated data stored without redundancy**
- ❌ Programming interface
- ❌ Real-time transaction system

**Memory Trick:** "Database = Data + Base (foundation)" - organized data foundation, no duplication!

---

### Q2: Primary Function of DBMS?
**Simple Question:** DBMS main job is _____?
- ❌ Manage hardware
- ✅ **Interface between users and database for defining/retrieving data**
- ❌ Execute algorithms
- ❌ Enforce security at application level

**Memory Trick:** "DBMS = Middle Man" - sits between you and data, helps you talk to data!

---

### Q3: Physical Level of DBMS?
**Simple Question:** Which level shows HOW data is stored on disk?
- ❌ External Level
- ❌ Logical Level
- ✅ **Physical Level (Internal Level)**
- ❌ Abstraction Level

**Memory Trick:** "Physical = Physical storage" - deals with files, indexes, disk blocks

---

### Q4: Logical Level Purpose?
**Simple Question:** Logical level describes _____?
- ❌ Storage details
- ✅ **Complete structure of database - what data & relationships**
- ❌ User-specific views
- ❌ Access paths

**Memory Trick:** "Logical = Complete Logic of database" - entire database structure without storage details

---

### Q5: View Level (External)?
**Simple Question:** View provides _____?
- ❌ Physical schema
- ❌ Internal schema
- ❌ Conceptual schema
- ✅ **Simplified, user-specific subset hiding complexity**

**Memory Trick:** "View = Your View" - customized window for specific users

---

## SECTION 2: DATA MODELS

### Q6: What is Data Model?
**Simple Question:** Data model describes _____?
- ❌ Storage devices
- ✅ **Data, relationships, semantics, and constraints**
- ❌ OS instructions
- ❌ Application logic

**Memory Trick:** "Data Model = Blueprint" - shows structure, connections, and rules

---

### Q7: DBMS Characteristic NOT typical?
**Simple Question:** Which is NOT a DBMS feature?
- ❌ Data redundancy control
- ❌ Data sharing
- ❌ Concurrent access support
- ✅ **Exclusive focus on Machine Language Programming**

**Memory Trick:** DBMS uses high-level SQL, not low-level machine code!

---

## SECTION 3: KEYS & CONSTRAINTS

### Q8: Super Key?
**Simple Question:** Super Key is _____?
- ❌ Minimal unique identifier
- ✅ **Any attribute(s) that uniquely identifies tuples (not necessarily minimal)**
- ❌ Foreign key reference
- ❌ Non-key attributes for sorting

**Memory Trick:** "Super = Superman = Has EXTRA power" - may have extra attributes

---

### Q9: Candidate Key?
**Simple Question:** Candidate Key is _____?
- ❌ Foreign Key
- ❌ Simple Key
- ✅ **Minimal Super Key - uniquely identifies with NO redundant attributes**
- ❌ Secondary Key

**Memory Trick:** "Candidate = Qualified Candidate" - minimal and sufficient to identify!

---

### Q10: Data Dictionary stores?
**Simple Question:** Data Dictionary holds _____?
- ❌ Data files
- ❌ Index structures
- ✅ **Metadata: schema definitions, constraints, authorization info**
- ❌ Application programs

**Memory Trick:** "Dictionary = Definitions" - stores definitions about data, not actual data

---

### Q11: Entity Integrity Constraint?
**Simple Question:** Entity Integrity means _____?
- ❌ Referential integrity
- ✅ **Primary Key cannot be NULL**
- ❌ Domain constraint
- ❌ Key constraint

**Memory Trick:** "Entity Integrity = Every entity must be identifiable" - no NULL in PK!

---

### Q12: Foreign Key purpose?
**Simple Question:** Foreign Key _____?
- ❌ Uniquely identifies within same table
- ✅ **References Primary/Candidate Key of another table to establish link**
- ❌ Must be distinct
- ❌ Enforces domain constraints

**Memory Trick:** "Foreign Key = Foreign passport" - links to another table!

---

### Q13: Referential Integrity?
**Simple Question:** Referential Integrity ensures _____?
- ❌ Entity integrity
- ❌ Domain integrity
- ✅ **Foreign Key values must exist in referenced Primary Key**
- ❌ Constraint integrity

**Memory Trick:** "Referential = Reference must be valid" - FK must point to existing PK!

---

### Q14: Foreign Key with DeptID example?
**Simple Question:** EMPLOYEE(DeptID) refers to DEPARTMENT(DID). DeptID is?
- ❌ Primary Key
- ❌ Super Key
- ✅ **Foreign Key**
- ❌ Secondary Key

**Memory Trick:** Employee references Department = FK in Employee table

---

### Q15: NULL in Foreign Key means?
**Simple Question:** NULL Foreign Key means _____?
- ❌ Must match NULL in PK
- ❌ Not allowed
- ✅ **Tuple doesn't participate in relationship (if allowed)**
- ❌ Relation is inconsistent

**Memory Trick:** "NULL FK = Not assigned yet" - no relationship established

---

## SECTION 4: NORMALIZATION & DECOMPOSITION

### Q16: Conceptual Schema is?
**Simple Question:** Conceptual Schema represents _____?
- ❌ External Schema
- ❌ Internal Schema
- ❌ View Schema
- ✅ **Community view - global database structure for all users**

**Memory Trick:** "Conceptual = Complete concept" - overall logical structure

---

### Q17: Lossless Decomposition?
**Simple Question:** Lossless Join Decomposition means _____?
- ❌ FDs preserved
- ✅ **Natural join of sub-relations = original relation (R₁ ⋈ R₂ = R)**
- ❌ R₁ ∩ R₂ contains PK of R
- ❌ Size reduced

**Memory Trick:** "Lossless = No data loss" - can reconstruct original perfectly!

---

### Q18: Binary Lossless condition?
**Simple Question:** R decomposed to R₁, R₂ is lossless if _____?
- ❌ R₁ ∩ R₂ is superkey for R
- ✅ **R₁ ∩ R₂ is superkey for R₁ OR R₂**
- ❌ R₁ ∪ R₂ equals R
- ❌ Tables smaller than R

**Memory Trick:** "Common attributes must be key in ONE side" - intersection must control one table

---

### Q19: Dependency Preserving?
**Simple Question:** Dependency Preserving means _____?
- ❌ Every FD in one decomposed table
- ✅ **Union of projected FDs equivalent to original FDs (∪Fᵢ)⁺ = F⁺**
- ❌ F⁺ - (∪Fᵢ)⁺ is empty
- ❌ Union of attributes is superkey

**Memory Trick:** "Preserve = Keep all rules" - all dependencies checkable locally

---

### Q20: Why Lossless is critical?
**Simple Question:** Lossless decomposition prevents _____?
- ❌ Query optimization issues
- ✅ **Spurious tuples (incorrect invented rows) when joining**
- ❌ Foreign key issues
- ❌ 3NF violations

**Memory Trick:** "Lossless = No fake rows" - joining won't create garbage data!

---

### Q21: R(A,B,C) with F={A→B, B→C}, decompose to R₁(A,B), R₂(B,C)?
**Simple Question:** Is this decomposition lossless AND dependency preserving?
- ✅ **Both lossless and dependency preserving**
- ❌ Lossless only
- ❌ Dependency preserving only
- ❌ Neither

**Memory Trick:** Intersection {B} is key in R₂, and all FDs present = both properties satisfied!

---

### Q22: Chase Algorithm purpose?
**Simple Question:** Chase Algorithm tests _____?
- ❌ Attribute Closure
- ❌ Dependency Basis
- ✅ **If n-ary decomposition is lossless (n > 2)**
- ❌ Canonical Cover

**Memory Trick:** "Chase = Chase the losslessness" - uses symbols to check multi-table decomposition

---

### Q23: BCNF vs 3NF trade-off?
**Simple Question:** Which is true about BCNF/3NF?
- ❌ BCNF always preserves dependencies
- ❌ 3NF prioritizes losslessness over dependency
- ✅ **BCNF always lossless but MAY lose dependency preservation**
- ❌ Dependency always prioritized

**Memory Trick:** "BCNF = Better Normal Form but may Break dependencies"

---

## SECTION 5: SQL BASICS

### Q24: SQL stands for?
**Simple Question:** SQL = _____?
- ❌ Standard Query Language
- ❌ Structured Question Language
- ❌ Sequential Query Logic
- ✅ **Structured Query Language**

**Memory Trick:** "SQL = Structured Query Language" - Structure your queries!

---

### Q25: SQL command categories?
**Simple Question:** Which is NOT SQL command type?
- ❌ DDL (Data Definition)
- ❌ DML (Data Manipulation)
- ✅ **DSL (Data Standardization) - NOT REAL**
- ❌ DCL (Data Control)

**Memory Trick:** Remember "DDL, DML, DCL, TCL" - no DSL!

---

### Q26: CREATE TABLE belongs to?
**Simple Question:** CREATE TABLE is _____?
- ❌ DML
- ❌ DCL
- ✅ **DDL (Data Definition Language)**
- ❌ TCL

**Memory Trick:** "CREATE = Define structure" - DDL defines schema

---

### Q27: DROP TABLE does?
**Simple Question:** DROP TABLE _____?
- ❌ Deletes data only
- ❌ Removes table (not real)
- ✅ **Permanently removes table definition AND all data**
- ❌ Truncates table

**Memory Trick:** "DROP = Complete destruction" - structure + data gone!

---

### Q28: ALTER TABLE purpose?
**Simple Question:** ALTER TABLE _____?
- ❌ Updates data
- ✅ **Modifies table structure (add/drop/modify columns)**
- ❌ Changes table name
- ❌ Redefines table

**Memory Trick:** "ALTER = Change structure" - DDL for schema changes

---

### Q29: UNIQUE vs PRIMARY KEY?
**Simple Question:** UNIQUE constraint _____?
- ✅ **Allows NULL values (one NULL) but enforces uniqueness**
- ❌ Same as PRIMARY KEY
- ❌ Requires NOT NULL
- ❌ Is a foreign key

**Memory Trick:** "UNIQUE = Unique but can be empty (NULL)" - PK cannot be NULL!

---

### Q30: FOREIGN KEY enforces?
**Simple Question:** FOREIGN KEY establishes _____?
- ❌ PRIMARY KEY
- ❌ NOT NULL
- ❌ CHECK
- ✅ **Link between tables (referential integrity)**

**Memory Trick:** "FOREIGN KEY = Bridge between tables"

---

### Q31: CHECK constraint?
**Simple Question:** CHECK constraint _____?
- ❌ Domain definition
- ✅ **Restricts value range (e.g., Salary > 0)**
- ❌ Range keyword
- ❌ Limits rows

**Memory Trick:** "CHECK = Check condition before insert/update"

---

### Q32: WHERE clause filters?
**Simple Question:** WHERE filters _____?
- ❌ After grouping
- ❌ After aggregation
- ✅ **Individual rows BEFORE grouping**
- ❌ After ordering

**Memory Trick:** "WHERE = Filter first" - happens before GROUP BY

---

### Q33: DISTINCT keyword?
**Simple Question:** DISTINCT _____?
- ✅ **Eliminates duplicate rows from result**
- ❌ Unique constraint
- ❌ Top rows
- ❌ Single row

**Memory Trick:** "DISTINCT = Different only" - no duplicates!

---

### Q34: HAVING clause requires?
**Simple Question:** HAVING must be used with _____?
- ❌ WHERE
- ❌ ORDER BY
- ✅ **GROUP BY**
- ❌ FROM

**Memory Trick:** "HAVING comes AFTER GROUP BY" - filters grouped results

---

### Q35: COUNT(*) counts?
**Simple Question:** COUNT(*) counts _____?
- ❌ Non-NULL values only
- ✅ **Total rows including NULLs**
- ❌ Distinct values
- ❌ NULL values only

**Memory Trick:** "COUNT(*) = Count ALL rows" - includes everything!

---

### Q36: AVG() function?
**Simple Question:** AVG() calculates _____?
- ❌ Sum
- ✅ **Average (arithmetic mean)**
- ❌ Mean (different concept)
- ❌ Count

**Memory Trick:** "AVG = Average value"

---

### Q37: LIKE operator for?
**Simple Question:** LIKE is used for _____?
- ❌ Exact equality
- ✅ **Pattern matching with wildcards (%, _)**
- ❌ Matching keyword
- ❌ IN operator

**Memory Trick:** "LIKE = Similar to" - % = many chars, _ = one char

---

### Q38: CROSS JOIN result?
**Simple Question:** CROSS JOIN produces _____?
- ❌ M + N rows
- ✅ **M × N rows (Cartesian product)**
- ❌ Min(M,N) rows
- ❌ Matching rows only

**Memory Trick:** "CROSS = Multiply everything" - every row with every row!

---

### Q39: Which is NOT a join type?
**Simple Question:** Which is NOT a join?
- ❌ Inner Join
- ❌ Outer Join
- ❌ Cross Join
- ✅ **Parallel Join (not SQL standard)**

**Memory Trick:** Standard joins: Inner, Outer (Left/Right/Full), Cross - no Parallel!

---

### Q40: ORDER BY default?
**Simple Question:** ORDER BY without ASC/DESC defaults to _____?
- ❌ Descending
- ❌ Random
- ✅ **Ascending (ASC)**
- ❌ Reverse entry order

**Memory Trick:** "ORDER BY = A to Z by default" - Ascending is default!

---

### Q41: NULL means?
**Simple Question:** NULL represents _____?
- ❌ Zero (0)
- ❌ Empty string ("")
- ✅ **Unknown/missing/not applicable value**
- ❌ Primary Key violation

**Memory Trick:** "NULL = Nothing/Unknown" - absence of value!

---

### Q42: Check for NULL using?
**Simple Question:** To check NULL use _____?
- ❌ = NULL
- ✅ **IS NULL**
- ❌ NULL CHECK
- ❌ FIND NULL

**Memory Trick:** "IS NULL, not = NULL" - special operator needed!

---

### Q43: AS keyword purpose?
**Simple Question:** AS keyword provides _____?
- ❌ New data type
- ❌ Ordering
- ✅ **Temporary alias (alternative name)**
- ❌ File format conversion

**Memory Trick:** "AS = Also known AS" - nickname for column/table

---

### Q44: LIMIT N clause?
**Simple Question:** LIMIT N returns _____?
- ❌ First N columns
- ✅ **First N rows**
- ❌ Maximum N rows
- ❌ Returns N value

**Memory Trick:** "LIMIT = Limit number of rows returned"

---

### Q45: TRUNCATE vs DELETE?
**Simple Question:** TRUNCATE TABLE _____?
- ❌ Drops table
- ❌ Deletes with condition
- ❌ Clears table
- ✅ **Removes all rows FAST (DDL, not logged per row)**

**Memory Trick:** "TRUNCATE = Fast delete all" - faster than DELETE!

---

### Q46: COMMIT command?
**Simple Question:** COMMIT _____?
- ❌ Rollback
- ❌ Approves
- ✅ **Makes transaction changes permanent**
- ❌ Finalize

**Memory Trick:** "COMMIT = Commit to changes" - saves permanently!

---

### Q47: ROLLBACK command?
**Simple Question:** ROLLBACK _____?
- ✅ **Undoes all changes since last COMMIT**
- ❌ Revert
- ✅ **ROLLBACK**
- ❌ Restore

**Memory Trick:** "ROLLBACK = Roll back time" - undo changes!

---

### Q48: GRANT command?
**Simple Question:** GRANT is _____?
- ❌ Authorize
- ❌ Permit
- ✅ **DCL command to give user permissions**
- ❌ Assign

**Memory Trick:** "GRANT = Give permission" - DCL for access control

---

### Q49: REVOKE command?
**Simple Question:** REVOKE _____?
- ✅ **Takes away previously granted permissions**
- ❌ Deny
- ❌ Remove
- ❌ Recall

**Memory Trick:** "REVOKE = Remove permission" - opposite of GRANT

---

### Q50: View in SQL?
**Simple Question:** View is _____?
- ❌ Physical copy
- ❌ Transaction log
- ✅ **Virtual table based on SELECT query**
- ❌ Stored procedure

**Memory Trick:** "View = Virtual window" - saved query, not actual data!

---

## SECTION 6: INDEXING

### Q51: Primary purpose of indexing?
**Simple Question:** Indexing improves _____?
- ❌ Storage space
- ❌ Redundancy reduction
- ✅ **Data retrieval speed (SELECT queries)**
- ❌ Transaction isolation

**Memory Trick:** "Index = Book index" - find data faster!

---

### Q52: Dense Index has?
**Simple Question:** Dense Index contains _____?
- ✅ **Entry for EVERY data record**
- ❌ Entry per block only
- ❌ First record only
- ❌ Primary key only

**Memory Trick:** "Dense = Densely packed" - index entry for each record!

---

### Q53: Sparse Index has?
**Simple Question:** Sparse Index contains _____?
- ❌ Every record
- ❌ Non-NULL records
- ✅ **Entry for first record in each BLOCK only**
- ❌ Primary key values only

**Memory Trick:** "Sparse = Spaced out" - fewer entries, saves space!

---

### Q54: Primary Index built on?
**Simple Question:** Primary Index is on _____?
- ❌ Any field
- ❌ Non-key field
- ✅ **Ordering key field (usually Primary Key)**
- ❌ Secondary field

**Memory Trick:** "Primary Index on Primary Key" - data sorted by this key!

---

### Q55: Secondary Index built on?
**Simple Question:** Secondary Index is on _____?
- ❌ Ordering key
- ✅ **Non-ordering attribute (data not sorted by it)**
- ❌ Primary key
- ❌ Sparse index field

**Memory Trick:** "Secondary = Second way to access" - alternate access path!

---

### Q56: Secondary Index is always?
**Simple Question:** Secondary Index must be _____?
- ❌ Sparse
- ✅ **Dense (entry for every record)**
- ❌ Clustered
- ❌ Sparse by default

**Memory Trick:** "Secondary = Dense always" - data not sorted, need all pointers!

---

### Q57: Clustered Index means?
**Simple Question:** Clustered Index _____?
- ❌ Must be non-key
- ❌ Includes entire record
- ✅ **Physical data order = index order**
- ❌ Multiple columns

**Memory Trick:** "Clustered = Physically organized" - data stored in index order!

---

### Q58: How many Primary Indexes per table?
**Simple Question:** A table can have _____ Primary Index(es)?
- ❌ Zero
- ✅ **Exactly ONE**
- ❌ Up to candidate key count
- ❌ Unlimited

**Memory Trick:** "ONE table = ONE Primary Index" - only one physical order!

---

### Q59: Multi-level Index purpose?
**Simple Question:** Multi-level Index reduces _____?
- ❌ Indexed fields
- ✅ **Disk I/Os for searching large index**
- ❌ Physical orderings
- ❌ Variable-size records

**Memory Trick:** "Multi-level = Hierarchy" - index on index, like B-Tree!

---

### Q60: B-Tree vs B+ Tree?
**Simple Question:** B+ Tree stores data pointers in _____?
- ❌ Internal nodes
- ❌ Root node
- ✅ **Leaf nodes ONLY (all data at bottom)**
- ❌ Index blocks

**Memory Trick:** "B+ = Plus all data in leaves" - internal nodes guide only!

---

### Q61: B+ Tree advantage?
**Simple Question:** B+ Tree better for _____?
- ❌ Less memory
- ✅ **Range queries (leaf nodes linked sequentially)**
- ❌ Atomic operations
- ❌ Isolation

**Memory Trick:** "B+ = Better range scans" - linked leaves make scanning easy!

---

### Q62: B+ Tree is?
**Simple Question:** B+ Tree is _____?
- ❌ Data only in internal nodes
- ✅ **Height-balanced, all leaves at same level**
- ❌ May become unbalanced
- ❌ Requires traversing every node

**Memory Trick:** "B+ = Balanced Plus" - self-balancing tree!

---

### Q63: Fan-out (Branching factor)?
**Simple Question:** Fan-out is _____?
- ❌ Total leaf nodes
- ❌ Minimum entries per node
- ✅ **Maximum child pointers per internal node**
- ❌ Tree depth

**Memory Trick:** "Fan-out = Fanning out branches" - how many children per node!

---

### Q64: Disadvantage of indexes?
**Simple Question:** Index disadvantage is _____?
- ❌ Slows SELECT
- ❌ Excessive RAM use
- ✅ **Slows INSERT/UPDATE/DELETE (must update index)**
- ❌ Prevents foreign keys

**Memory Trick:** "Index = Good for reads, BAD for writes" - maintenance overhead!

---

## SECTION 7: ER MODEL

### Q65: ER Model purpose?
**Simple Question:** ER Model provides _____?
- ❌ Physical storage definition
- ✅ **High-level conceptual database blueprint**
- ❌ SQL queries
- ❌ Integrity enforcement

**Memory Trick:** "ER = Entity-Relationship blueprint" - design before building!

---

### Q66: Entity Type represented by?
**Simple Question:** Entity Type shown as _____?
- ❌ Oval
- ❌ Diamond
- ✅ **Rectangle**
- ❌ Double rectangle

**Memory Trick:** "Entity = Box (Rectangle)" - things in boxes!

---

### Q67: Attribute represented by?
**Simple Question:** Attribute shown as _____?
- ✅ **Oval/Ellipse**
- ❌ Diamond
- ❌ Rectangle
- ❌ Double rectangle

**Memory Trick:** "Attribute = Oval" - properties in ovals!

---

### Q68: Relationship represented by?
**Simple Question:** Relationship shown as _____?
- ❌ Oval
- ✅ **Diamond**
- ❌ Rectangle
- ❌ Double oval

**Memory Trick:** "Relationship = Diamond" - connections in diamonds!

---

### Q69: Multivalued Attribute shown as?
**Simple Question:** Multivalued Attribute is _____?
- ❌ Single ellipse with underline
- ❌ Connected ellipses
- ✅ **Double ellipse**
- ❌ Dashed ellipse

**Memory Trick:** "Multi = Double ellipse" - can have multiple values!

---

### Q70: Cardinality Constraints define?
**Simple Question:** Cardinality specifies _____?
- ❌ Structural constraints
- ❌ Participation constraints
- ✅ **MAXIMUM times entity can be associated (1:1, 1:N, M:N)**
- ❌ Domain constraints

**Memory Trick:** "Cardinality = Count maximum" - how many relationships max!

---

### Q71: Weak Entity shown as?
**Simple Question:** Weak Entity shown as _____?
- ❌ Rectangle
- ❌ Diamond
- ❌ Oval
- ✅ **Double rectangle**

**Memory Trick:** "Weak = Double rectangle" - needs support, double border!

---

### Q72: Weak Entity characteristic?
**Simple Question:** Weak Entity _____?
- ❌ Cannot participate in relationships
- ❌ Has no candidate keys
- ✅ **Has no key of its own, depends on owner entity**
- ❌ Must be 1:1

**Memory Trick:** "Weak = Cannot stand alone" - needs owner's key!

---

### Q73: Identifying Relationship?
**Simple Question:** Weak Entity to Owner is _____?
- ❌ 1:1
- ❌ M:N
- ✅ **1:N (One owner to Many weak entities)**
- ❌ N:1

**Memory Trick:** "One owner, many dependents" - owner identifies weak entities!

---

### Q74: Partial Key shown as?
**Simple Question:** Partial Key (in weak entity) shown as _____?
- ❌ Single underline
- ✅ **Double underline (dashed)**
- ❌ No underline
- ❌ Identifying attribute

**Memory Trick:** "Partial = Dashed/Double underline" - not complete key alone!

---

### Q75: Derived Attribute shown as?
**Simple Question:** Derived Attribute (e.g., Age from BirthDate) shown as _____?
- ❌ Composite
- ✅ **Dashed ellipse**
- ❌ Multivalued
- ❌ Stored

**Memory Trick:** "Derived = Dashed" - calculated, not stored!

---

### Q76: Key Attribute shown as?
**Simple Question:** Primary Key Attribute shown as _____?
- ✅ **Single underline**
- ❌ Partial key
- ❌ Multivalued
- ❌ Identifying

**Memory Trick:** "Key = Underlined once" - unique identifier!

---

### Q77: Composite Attribute?
**Simple Question:** Composite Attribute (e.g., Address) shown as _____?
- ✅ **Ellipse connected to other ellipses (components)**
- ❌ Double ellipse
- ❌ Dashed ellipse
- ❌ Underlined

**Memory Trick:** "Composite = Connected parts" - made of sub-attributes!

---

### Q78: Total Participation shown as?
**Simple Question:** Total Participation shown as _____?
- ✅ **Double line from entity to relationship**
- ❌ Single line
- ❌ 1:1 cardinality
- ❌ Referential integrity

**Memory Trick:** "Total = Double line" - every entity MUST participate!

---

### Q79: Recursive Relationship?
**Simple Question:** Recursive Relationship is _____?
- ❌ Ternary
- ✅ **Same entity type relates to itself (e.g., Employee supervises Employee)**
- ❌ Self-referencing attribute
- ❌ Specialization

**Memory Trick:** "Recursive = Self-relationship" - entity relates to same type!

---

### Q80: 1:N Cardinality means?
**Simple Question:** 1:N relationship means _____?
- ❌ 1 to 1
- ❌ Many to many
- ✅ **One entity on "1" side relates to MANY on "N" side**
- ❌ Total participation

**Memory Trick:** "1:N = One to Many" - one department, many employees!

---

### Q81: Ternary Relationship (degree 3)?
**Simple Question:** Ternary Relationship involves _____?
- ❌ Binary
- ❌ Multiplicity
- ✅ **THREE entity types**
- ❌ Specialized

**Memory Trick:** "Ternary = Three entities" - like Supplier-Part-Project!

---

### Q82: Generalization/Specialization?
**Simple Question:** ISA (is-a) relationship represents _____?
- ❌ Aggregation
- ❌ Abstraction
- ✅ **Inheritance (superclass/subclass hierarchy)**
- ❌ Modularity

**Memory Trick:** "ISA = Is A type of" - Student IS A Person (inheritance)!

---

### Q83: ER to Relational: Entity becomes?
**Simple Question:** Strong Entity becomes _____?
- ✅ **Separate table with entity attributes**
- ❌ 1:N relationship
- ❌ Total participation constraint
- ❌ Simple attribute

**Memory Trick:** "Entity = Table" - each entity type becomes a table!

---

### Q84: ER to Relational: Multivalued Attribute?
**Simple Question:** Multivalued Attribute becomes _____?
- ✅ **Separate table (PK of entity + attribute)**
- ❌ 1:N relationship
- ❌ Total participation
- ❌ Simple attribute

**Memory Trick:** "Multivalued = Separate table" - can't store multiple values in one cell!

---

### Q85: Weak Entity mapping?
**Simple Question:** Weak Entity becomes table with _____?
- ✅ **Composite key: Owner's PK + Partial key**
- ❌ Own primary key
- ❌ Foreign key only
- ❌ Separate relationship table

**Memory Trick:** "Weak = Owner PK + Partial key" - combination identifies it!

---

### Q86: 1:N Relationship mapping?
**Simple Question:** 1:N relationship maps to _____?
- ❌ Department references Employee
- ✅ **Foreign Key in "N" side table (Employee has Dept_ID)**
- ❌ Both tables reference each other
- ❌ Separate relationship table

**Memory Trick:** "N-side gets FK" - many side points to one side!

---

### Q87: M:N Relationship mapping?
**Simple Question:** M:N relationship maps to _____?
- ❌ FK in either table
- ✅ **Separate relationship table with both PKs as FK**
- ❌ No separate table needed
- ❌ Store in one table

**Memory Trick:** "M:N = New junction table" - bridge table with both keys!

---

### Q88: Ternary Relationship mapping?
**Simple Question:** Ternary relationship (3 entities) maps to _____?
- ❌ Student + Course table only
- ✅ **Single table with all 3 entity PKs**
- ❌ Three binary relationships
- ❌ Store in one entity table

**Memory Trick:** "Ternary = One table, three keys" - junction table with 3 FKs!

---

## SECTION 8: RELATIONAL ALGEBRA

### Q89: Selection (σ) operator?
**Simple Question:** σ (sigma) operator _____?
- ❌ Projects columns
- ❌ Union
- ✅ **Filters ROWS based on condition**
- ❌ Cartesian product

**Memory Trick:** "σ = Select rows" - horizontal filter!

---

### Q90: Projection (π) operator?
**Simple Question:** π (pi) operator _____?
- ❌ Selection
- ❌ Intersection
- ✅ **Filters COLUMNS (vertical subset)**
- ❌ Difference

**Memory Trick:** "π = Pick columns" - vertical filter!

---

### Q91: Fundamental relational algebra operations?
**Simple Question:** Fundamental set is _____?
- ❌ σ, π, ∪, ×, ∩
- ✅ **σ, π, ∪, ×, ρ (Selection, Projection, Union, Cartesian, Rename)**
- ❌ σ, π, ∩, ×, ρ
- ❌ σ, π, -, ×, ρ

**Memory Trick:** "σ-π-∪-×-ρ = SPUCR" - can derive all others from these!

---

### Q92: Union (∪) returns?
**Simple Question:** R ∪ S returns _____?
- ❌ All with duplicates
- ❌ Common tuples
- ✅ **All tuples in R OR S (duplicates removed)**
- ❌ Tuples only in R

**Memory Trick:** "∪ = OR operation" - combines both sets!

---

### Q93: Union compatible means?
**Simple Question:** For R ∪ S, relations must _____?
- ❌ Same number of tuples
- ❌ Same attributes
- ✅ **Same number of attributes + corresponding domains match**
- ❌ At least one common attribute

**Memory Trick:** "Union compatible = Same structure" - same column count and types!

---

### Q94: Natural Join (⋈)?
**Simple Question:** Natural Join R ⋈ S equals _____?
- ❌ σ then π on R × S
- ❌ π then R × S
- ✅ **R × S, then σ on common attributes, then π (remove duplicates)**
- ❌ R × S then σ then π

**Memory Trick:** "Natural Join = Smart join" - auto-joins on same-named attributes!

---

### Q95: Set Difference (R - S)?
**Simple Question:** R - S returns _____?
- ❌ Intersection
- ✅ **Tuples in R but NOT in S**
- ❌ Division
- ❌ Theta join

**Memory Trick:** "R - S = R minus S" - subtract S from R!

---

### Q96: Theta Join (R ⋈θ S)?
**Simple Question:** Theta Join allows _____?
- ❌ All attributes
- ✅ **Any comparison operator θ (=, ≠, <, >, ≤, ≥)**
- ❌ Equivalent to Natural Join
- ❌ Theta is outer join

**Memory Trick:** "Theta = Any condition θ" - flexible join condition!

---

### Q97: Intersection (R ∩ S) can be expressed as?
**Simple Question:** R ∩ S equivalent to _____?
- ✅ **R - (R - S)**
- ❌ (R - S) ∪ (S - R)
- ❌ R ∪ S - (R ∩ S)
- ❌ R × S - σ

**Memory Trick:** "Common = R minus (R minus S)" - what remains after removing differences!

---

### Q98: Left Outer Join?
**Simple Question:** R LeftJoin S includes _____?
- ❌ All from both
- ❌ All from S
- ✅ **All from R (left), even unmatched (NULLs for S attributes)**
- ❌ Only matching

**Memory Trick:** "Left Outer = Keep LEFT side" - all left rows preserved!

---

### Q99: Division (R ÷ S)?
**Simple Question:** Division R ÷ S finds _____?
- ❌ Unmatched tuples
- ✅ **Tuples in R associated with ALL tuples in S ("for all" queries)**
- ❌ Cartesian product
- ❌ Common tuples

**Memory Trick:** "Division = For ALL" - find entities related to everything in S!

---

### Q100: Cartesian Product size?
**Simple Question:** R(M rows) × S(N rows) produces _____?
- ❌ M + N rows
- ✅ **M × N rows**
- ❌ min(M, N)
- ❌ max(M, N)

**Memory Trick:** "× = Multiply" - every combination!

---

### Q101: Union compatible property?
**Simple Question:** If R ∪ S valid, which is TRUE?
- ❌ R ∪ S = R ∩ S
- ❌ R ∩ S = R - (R ∪ S)
- ✅ **(R ∩ S) ⊆ (R ∪ S) - Intersection is subset of Union**
- ❌ R × S = R ∪ S

**Memory Trick:** "Intersection smaller than Union" - common items ⊆ all items!

---

### Q102: Relational Algebra is closed means?
**Simple Question:** Closed means _____?
- ❌ Result is empty set
- ❌ Operations can't combine
- ✅ **Input = relation, Output = relation (always)**
- ❌ Cannot be combined

**Memory Trick:** "Closed = Relations in, Relations out" - output can be input to next operation!

---

### Q103: Associativity of × and ⋈?
**Simple Question:** Which is TRUE?
- ✅ **Both × and ⋈ are associative: (R×S)×T = R×(S×T)**
- ❌ Neither associative
- ❌ Only × associative
- ❌ Only ⋈ associative

**Memory Trick:** "Associative = Rearrange order" - can change grouping!

---

### Q104: Relational Algebra is procedural because?
**Simple Question:** Procedural means _____?
- ❌ Specifies what, not how
- ✅ **User specifies HOW (sequence of operations)**
- ❌ Based on logic
- ❌ Only operates on tables

**Memory Trick:** "Procedural = Step-by-step procedure" - specify operations explicitly!

---

## SECTION 9: TRANSACTIONS (ACID)

### Q105: Transaction definition?
**Simple Question:** Transaction is _____?
- ❌ Any SQL query
- ❌ All changes to database
- ✅ **Logical unit of work - all-or-nothing**
- ❌ User request handler

**Memory Trick:** "Transaction = All or nothing" - complete or undo!

---

### Q106: Transaction boundaries?
**Simple Question:** Transaction ends with _____?
- ❌ OPEN and CLOSE
- ❌ READ and WRITE
- ❌ START and FINISH
- ✅ **COMMIT (success) or ROLLBACK (failure)**

**Memory Trick:** "COMMIT = Save, ROLLBACK = Undo" - two endings!

---

### Q107: Durability property?
**Simple Question:** Durability ensures _____?
- ✅ **Committed changes survive system crashes**
- ❌ Atomicity
- ❌ Consistency
- ❌ Isolation

**Memory Trick:** "Durability = Durable/Permanent" - changes last forever!

---

### Q108: Atomicity property?
**Simple Question:** Atomicity ensures _____?
- ❌ Concurrent transactions don't interfere
- ❌ Preserves constraints
- ✅ **Transaction is indivisible - all or nothing**
- ❌ Results are permanent

**Memory Trick:** "Atomicity = Atomic (indivisible)" - cannot split transaction!

---

### Q109: Consistency property?
**Simple Question:** Consistency ensures _____?
- ❌ All reads return same data
- ✅ **Transaction moves DB from one valid state to another**
- ❌ Same speed
- ❌ Results permanent

**Memory Trick:** "Consistency = Constraints obeyed" - rules never broken!

---

### Q110: Isolation property?
**Simple Question:** Isolation ensures _____?
- ❌ Only authorized users access
- ❌ Locks all data
- ❌ Atomic execution
- ✅ **Concurrent transactions execute as if alone (independent)**

**Memory Trick:** "Isolation = Island" - transactions isolated from each other!

---

### Q111: Schedule definition?
**Simple Question:** Schedule is _____?
- ❌ Order of user submissions
- ❌ Log records
- ✅ **Sequence of interleaved operations of concurrent transactions**
- ❌ Query plan

**Memory Trick:** "Schedule = Timeline" - order of operations execution!

---

### Q112: Serial Schedule?
**Simple Question:** Serial Schedule means _____?
- ❌ Sequential but changing order
- ✅ **All operations of T1 complete BEFORE T2 starts**
- ❌ Interleaved read-only
- ❌ Leads to consistent state

**Memory Trick:** "Serial = One after another" - no interleaving!

---

### Q113: Concurrent Schedule?
**Simple Question:** Concurrent Schedule means _____?
- ❌ All on different CPUs
- ❌ Equivalent to serial
- ✅ **Operations of multiple transactions INTERLEAVED**
- ❌ Only one transaction active

**Memory Trick:** "Concurrent = Interleaved" - mix operations!

---

### Q114: Serializable Schedule?
**Simple Question:** Serializable means _____?
- ❌ Only COMMIT/ROLLBACK
- ❌ No deadlock
- ✅ **Produces same result as SOME serial schedule**
- ❌ Two-phase locking

**Memory Trick:** "Serializable = Equivalent to serial" - correct concurrent execution!

---

### Q115: Two-Phase Locking (2PL)?
**Simple Question:** 2PL guarantees _____?
- ✅ **Serializable schedule**
- ❌ Conflict-free
- ❌ Free of deadlocks
- ❌ Always non-interleaved

**Memory Trick:** "2PL = Two phases" - Growing phase + Shrinking phase!

---

### Q116: Two phases in 2PL?
**Simple Question:** 2PL phases are _____?
- ❌ Read and Write
- ✅ **Growing (acquire locks) and Shrinking (release locks)**
- ❌ Commit and Validation
- ❌ Lock and Unlock

**Memory Trick:** "Growing then Shrinking" - get locks first, release later!

---

### Q117: 2PL disadvantage?
**Simple Question:** 2PL can cause _____?
- ✅ **Deadlocks**
- ❌ Unrepeatable reads
- ❌ Loss of durability
- ❌ Starvation only

**Memory Trick:** "2PL → Deadlock possible" - transactions wait for each other!

---

### Q118: Exclusive lock held by T1?
**Simple Question:** If T1 has X-lock on X, T2 can get _____?
- ❌ Shared lock
- ❌ Exclusive lock
- ❌ Update lock
- ✅ **No lock (must wait)**

**Memory Trick:** "Exclusive = No one else" - blocks all other locks!

---

### Q119: Cascading Rollback?
**Simple Question:** Cascading Rollback occurs when _____?
- ❌ Non-isolated
- ❌ Non-recoverable
- ✅ **Rollback of T1 forces rollback of T2 that read T1's uncommitted data**
- ❌ Conflict serializable

**Memory Trick:** "Cascade = Domino effect" - one rollback causes others!

---

### Q120: Recoverable Schedule?
**Simple Question:** Recoverable Schedule requires _____?
- ❌ Conflict serializable
- ❌ Free of cascading rollbacks
- ✅ **Transaction commits ONLY after all transactions it read from commit**
- ❌ Crash-proof logging

**Memory Trick:** "Recoverable = Read from committed only" - don't read dirty data!

---

### Q121: Precedence graph with cycle?
**Simple Question:** Cycle in precedence graph means _____?
- ❌ Isolated node
- ❌ Multiple edges
- ✅ **Schedule is NOT conflict serializable**
- ❌ Exactly two nodes

**Memory Trick:** "Cycle = Not serializable" - circular dependency problem!

---

### Q122: Why allow concurrent schedules?
**Simple Question:** Concurrent schedules improve _____?
- ❌ Absolute consistency
- ❌ Simplify protocols
- ✅ **System throughput and resource utilization**
- ❌ Atomicity

**Memory Trick:** "Concurrent = Better performance" - CPU/IO overlap!

---

### Q123: Highest SQL isolation level?
**Simple Question:** Highest isolation level is _____?
- ❌ Read Committed
- ❌ Repeatable Read
- ✅ **Serializable**
- ❌ Read Uncommitted

**Memory Trick:** "Serializable = Strictest" - prevents all anomalies!

---

## SECTION 10: ADVANCED INDEXING

### Q124: Clustering Index built on?
**Simple Question:** Clustering Index can be on _____?
- ❌ Only primary key
- ❌ Only non-key field
- ✅ **Any field that defines physical storage order**
- ❌ Only non-key fields

**Memory Trick:** "Clustering = Physical grouping" - data physically sorted by index!

---

### Q125: Clustering Index characteristic?
**Simple Question:** Clustering Index means _____?
- ❌ Multiple records with same value
- ❌ Must be on primary key
- ✅ **Index order = Physical data order**
- ❌ Always inherited

**Memory Trick:** "Clustered = Organized shelves" - data stored in order!

---

### Q126: Sparse Index entry for?
**Simple Question:** Sparse Index has entry for _____?
- ❌ Every record
- ❌ Non-NULL values
- ✅ **First record in each block only**
- ❌ Primary key values only

**Memory Trick:** "Sparse = One per block" - smaller index!

---

### Q127: Dense Index advantage?
**Simple Question:** Dense Index advantage is _____?
- ❌ Reduced storage
- ❌ Faster sequential scan
- ✅ **Faster direct lookup - pointer to EVERY record**
- ❌ Better variable-length records

**Memory Trick:** "Dense = Direct access" - every record indexed!

---

### Q128: Secondary Index on non-unique field?
**Simple Question:** Secondary Index on non-unique key contains _____?
- ❌ Key + pointer to first
- ❌ Sparse entry
- ✅ **List of pointers to ALL matching records**
- ❌ Only primary key + block address

**Memory Trick:** "Non-unique = Multiple pointers" - many records, many pointers!

---

### Q129: Multi-level Index purpose?
**Simple Question:** Multi-level Index reduces _____?
- ❌ Indexed fields
- ✅ **Disk I/Os by creating hierarchy**
- ❌ Multiple orderings
- ❌ Variable-size records

**Memory Trick:** "Multi-level = Hierarchy" - index the index!

---

### Q130: How many Primary Indexes allowed?
**Simple Question:** Table can have _____ Primary Index(es)?
- ❌ Zero
- ✅ **Exactly ONE**
- ❌ Up to candidate key count
- ❌ Unlimited

**Memory Trick:** "ONE physical order = ONE Primary Index"

---

### Q131: Clustering Index uniqueness?
**Simple Question:** Which is TRUE about Clustering Index?
- ❌ Secondary is always sparse
- ❌ Primary can only be sparse
- ✅ **Only Clustering Index order matches physical data order**
- ❌ Dense never used with primary key

**Memory Trick:** "Clustered = ONE way to physically store" - only one physical arrangement!

---

### Q132: B+ Tree internal nodes store?
**Simple Question:** B+ Tree internal nodes contain _____?
- ✅ **Only search keys and pointers (NO data pointers)**
- ❌ Data records
- ❌ Only leaf-level entries
- ❌ Only unique keys

**Memory Trick:** "B+ Internal = Road signs" - guide to leaves, no actual data!

---

### Q133: B-Tree vs B+ Tree data pointers?
**Simple Question:** In B-Tree, data pointers are in _____?
- ❌ Only leaf nodes
- ❌ Only root
- ✅ **Root, internal, AND leaf nodes**
- ❌ Only second level

**Memory Trick:** "B-Tree = Data everywhere; B+ = Data only at leaves"

---

### Q134: B+ Tree leaf nodes?
**Simple Question:** B+ Tree leaves are _____?
- ✅ **All at same level (height-balanced)**
- ❌ At different levels
- ❌ Unbalanced after inserts
- ❌ Require traversing every node

**Memory Trick:** "B+ = Balanced" - self-balancing, all leaves same depth!

---

### Q135: Fan-out definition?
**Simple Question:** Fan-out is _____?
- ❌ Total leaf nodes
- ❌ Minimum entries
- ✅ **Maximum child pointers per node**
- ❌ Tree depth

**Memory Trick:** "Fan-out = Branching width" - how wide tree can spread!

---

### Q136: B+ Tree better for databases why?
**Simple Question:** B+ Tree advantage over B-Tree?
- ❌ Less memory
- ✅ **Higher fan-out (more keys per node) → shorter tree**
- ❌ Guarantees no rebalancing
- ❌ Random data storage

**Memory Trick:** "B+ = More branches" - fit more keys, shallower tree!

---

### Q137: Multi-level Index bottom level?
**Simple Question:** Multi-level Index bottom level is _____?
- ❌ Root index
- ✅ **Sparse index of data file OR actual data file**
- ❌ Actual data records
- ❌ Clustered index

**Memory Trick:** "Bottom = Base level" - original index or data!

---

### Q138: Sparse Index smaller because?
**Simple Question:** Sparse Index smaller due to _____?
- ✅ **Stores only subset of search-key values**
- ❌ Uses hashing
- ❌ Stores only leaf-level
- ❌ Stores only unique keys

**Memory Trick:** "Sparse = Less entries" - one per block, not per record!

---

### Q139: Index disadvantage?
**Simple Question:** Major index disadvantage is _____?
- ❌ Slows SELECT
- ❌ Excessive RAM
- ✅ **Slows INSERT/UPDATE/DELETE (index maintenance)**
- ❌ Prevents foreign keys

**Memory Trick:** "Index = Read fast, Write slow" - updating index takes time!

---

### Q140: Which index level must be in memory?
**Simple Question:** For efficient search, which index level in RAM?
- ❌ All levels
- ❌ Only lowest
- ✅ **Only highest (root) level**
- ❌ Only leaf pointers

**Memory Trick:** "Root in RAM" - start point must be quick!

---

## SECTION 11: DISTRIBUTED & FRAGMENTATION

### Q141: Fragmentation must satisfy?
**Simple Question:** Horizontal fragmentation requires _____?
- ❌ Transparency and replication
- ❌ Minimality and replication
- ❌ Replication and atomicity
- ✅ **Completeness, reconstruction, disjointness**

**Memory Trick:** "CRD = Complete, Reconstruct, Disjoint" - all tuples, can rebuild, no overlap!

---

### Q142: Natural join on R(A,B) and S(B,C)?
**Simple Question:** R ⋈ S requires _____?
- ❌ All combinations
- ✅ **Matching domains for join attribute B**
- ❌ Discard all rows
- ❌ Identical to R × S

**Memory Trick:** "Natural join = Same name, same type" - auto-joins on common columns!

---

### Q143: σ Age > 18 (Students) does?
**Simple Question:** This expression _____?
- ❌ Removes Age column
- ✅ **Keeps only tuples with Age > 18**
- ❌ Groups by age
- ❌ Sorts by age

**Memory Trick:** "σ = Select rows where condition true"

---

### Q144: Dense Index vs Sparse?
**Simple Question:** Dense Index is better for _____?
- ✅ **Every search key value indexed**
- ❌ Uses hashing
- ❌ Stores only leaf-level
- ❌ Stores only unique keys

**Memory Trick:** "Dense = Every record has index entry"

---

## QUICK MEMORY FORMULAS

### ACID Properties:
- **A**tomicity = **A**ll or nothing
- **C**onsistency = **C**onstraints preserved
- **I**solation = **I**ndependent execution
- **D**urability = **D**ata survives crash

### SQL Commands:
- **DDL** = Define structure (CREATE, ALTER, DROP)
- **DML** = Manipulate data (SELECT, INSERT, UPDATE, DELETE)
- **DCL** = Control access (GRANT, REVOKE)
- **TCL** = Transaction control (COMMIT, ROLLBACK)

### Keys:
- **Super Key** = Unique (may have extra)
- **Candidate Key** = Minimal Super Key
- **Primary Key** = Chosen Candidate Key (NOT NULL)
- **Foreign Key** = References Primary Key of another table

### Indexes:
- **Dense** = Entry per record
- **Sparse** = Entry per block
- **Primary** = On ordering key
- **Secondary** = On non-ordering key
- **Clustered** = Physical order = Index order

### Joins:
- **Natural Join** = Auto-join on same-named attributes
- **Theta Join** = Join with any condition (θ)
- **Cross Join** = Cartesian product (M × N)
- **Left Outer** = All left rows + matched right
- **Right Outer** = All right rows + matched left
- **Full Outer** = All rows from both

### Relational Algebra:
- **σ** (sigma) = Select rows (WHERE)
- **π** (pi) = Project columns (SELECT columns)
- **∪** = Union (OR)
- **∩** = Intersection (AND)
- **−** = Difference (NOT IN)
- **×** = Cartesian Product
- **⋈** = Natural Join
- **÷** = Division (FOR ALL)

### Normal Forms:
- **1NF** = Atomic values
- **2NF** = 1NF + No partial dependency
- **3NF** = 2NF + No transitive dependency
- **BCNF** = 3NF + Every determinant is candidate key

### ER Diagram Symbols:
- **Rectangle** = Entity
- **Double Rectangle** = Weak Entity
- **Oval** = Attribute
- **Double Oval** = Multivalued Attribute
- **Dashed Oval** = Derived Attribute
- **Underline** = Primary Key
- **Double Underline** = Partial Key
- **Diamond** = Relationship
- **Double Diamond** = Identifying Relationship
- **Double Line** = Total Participation

---

## STUDY TIPS

1. **Group by Topic**: Learn one section at a time (Keys, SQL, Transactions, etc.)

2. **Visualize**: Draw ER diagrams, B+ Trees, and relational algebra trees

3. **Practice**: Write SQL queries and convert ER to tables

4. **Mnemonic Tricks**: Use the memory tricks provided!

5. **Past Papers**: Solve previous year questions

6. **Revision Cycle**: 
   - Day 1: Learn
   - Day 3: Revise
   - Day 7: Test yourself
   - Day 15: Final review

---

**Good luck with your exam! 🎓**
