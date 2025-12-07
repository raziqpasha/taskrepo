# DBMS PRACTICE QUIZ
## Test Your Knowledge - Active Recall Method

---

## QUIZ 1: BASIC CONCEPTS

**Q1:** What is a Database?
- [ ] Application programs
- [ ] Structured collection of related data (minimal redundancy) ✓
- [ ] Programming interface
- [ ] Real-time transaction system

**Q2:** Which level describes HOW data is stored?
- [ ] External Level
- [ ] Logical Level
- [ ] Physical Level ✓
- [ ] Abstraction Level

**Q3:** Which level provides user-specific simplified view?
- [ ] Physical Schema
- [ ] Internal Schema
- [ ] Conceptual Schema
- [ ] View (External Schema) ✓

---

## QUIZ 2: KEYS

**Q4:** What uniquely identifies tuples but may not be minimal?
- [ ] Candidate Key
- [ ] Super Key ✓
- [ ] Foreign Key
- [ ] Primary Key

**Q5:** What is unique AND minimal?
- [ ] Super Key
- [ ] Candidate Key ✓
- [ ] Foreign Key
- [ ] Secondary Key

**Q6:** What ensures primary key cannot be NULL?
- [ ] Referential Integrity
- [ ] Entity Integrity ✓
- [ ] Domain Constraint
- [ ] Key Constraint

---

## QUIZ 3: SQL COMMANDS

**Q7:** CREATE TABLE belongs to which category?
- [ ] DML
- [ ] DCL
- [ ] DDL ✓
- [ ] TCL

**Q8:** What ensures unique values but allows NULL?
- [ ] PRIMARY KEY
- [ ] UNIQUE ✓
- [ ] NOT NULL
- [ ] FOREIGN KEY

**Q9:** What removes all rows but keeps structure (faster than DELETE)?
- [ ] DROP TABLE
- [ ] DELETE FROM table_name
- [ ] CLEAR TABLE
- [ ] TRUNCATE TABLE ✓

**Q10:** What filters rows before grouping?
- [ ] GROUP BY
- [ ] HAVING
- [ ] WHERE ✓
- [ ] ORDER BY

---

## QUIZ 4: INDEXES

**Q11:** How many Primary Indexes per table?
- [ ] Zero
- [ ] Exactly one ✓
- [ ] Up to candidate keys
- [ ] Unlimited

**Q12:** What has index entry for every data record?
- [ ] Sparse Index
- [ ] Primary Index
- [ ] Dense Index ✓
- [ ] Clustered Index

**Q13:** What is built on non-ordering attribute (always dense)?
- [ ] Primary Index
- [ ] Clustered Index
- [ ] Secondary Index ✓
- [ ] Sparse Index

**Q14:** Where are data pointers in B+ Tree?
- [ ] Internal nodes
- [ ] Root node
- [ ] Leaf nodes only ✓
- [ ] Index blocks

---

## QUIZ 5: ACID PROPERTIES

**Q15:** What ensures transaction is all-or-nothing?
- [ ] Consistency
- [ ] Isolation
- [ ] Atomicity ✓
- [ ] Durability

**Q16:** What ensures committed changes survive crashes?
- [ ] Atomicity
- [ ] Consistency
- [ ] Isolation
- [ ] Durability ✓

**Q17:** What ensures transactions don't interfere?
- [ ] Atomicity
- [ ] Consistency
- [ ] Isolation ✓
- [ ] Durability

---

## QUIZ 6: RELATIONAL ALGEBRA

**Q18:** What selects subset of tuples satisfying condition?
- [ ] Projection
- [ ] Union
- [ ] Selection (σ) ✓
- [ ] Cartesian Product

**Q19:** What eliminates columns (vertical subset)?
- [ ] Selection
- [ ] Intersection
- [ ] Projection (π) ✓
- [ ] Difference

**Q20:** R (M tuples) × S (N tuples) = ?
- [ ] M+N
- [ ] M×N ✓
- [ ] Min(M,N)
- [ ] Max(M,N)

---

## QUIZ 7: E-R MODEL

**Q21:** What shape represents Entity Type?
- [ ] Oval/Ellipse
- [ ] Diamond
- [ ] Rectangle/Square ✓
- [ ] Double Rectangle

**Q22:** What is represented by double ellipse?
- [ ] Key Attribute
- [ ] Composite Attribute
- [ ] Multivalued Attribute ✓
- [ ] Derived Attribute

**Q23:** What defines min/max associations between entities?
- [ ] Structural Constraints
- [ ] Participation Constraints
- [ ] Cardinality Constraints ✓
- [ ] Domain Constraints

---

## QUIZ 8: JOINS

**Q24:** What returns only matching rows?
- [ ] Inner Join ✓
- [ ] Left Outer Join
- [ ] Right Outer Join
- [ ] Full Outer Join

**Q25:** CROSS JOIN of Table-A (M rows) and Table-B (N rows) gives?
- [ ] M+N rows
- [ ] M×N rows (Cartesian product) ✓
- [ ] Min(M,N) rows
- [ ] Only matching rows

---

## QUIZ 9: CONSTRAINTS

**Q26:** What enforces link between two tables?
- [ ] PRIMARY KEY
- [ ] CHECK
- [ ] NOT NULL
- [ ] FOREIGN KEY ✓

**Q27:** What restricts range of values in column?
- [ ] DOMAIN
- [ ] CHECK ✓
- [ ] RANGE
- [ ] LIMIT

---

## QUIZ 10: TRANSACTIONS

**Q28:** What makes transaction changes permanent?
- [ ] SAVE
- [ ] ROLLBACK
- [ ] COMMIT ✓
- [ ] FINALIZE

**Q29:** What is highest isolation level?
- [ ] Read Committed
- [ ] Repeatable Read
- [ ] Serializable ✓
- [ ] Read Uncommitted

**Q30:** What are the two phases of 2PL?
- [ ] Read/Write
- [ ] Growing/Shrinking ✓
- [ ] Read/Validation
- [ ] Lock Acquisition/Unlock

---

## ANSWER KEY

1. **B** - Structured collection of related data
2. **C** - Physical Level
3. **D** - View (External Schema)
4. **B** - Super Key
5. **B** - Candidate Key
6. **B** - Entity Integrity
7. **C** - DDL
8. **B** - UNIQUE
9. **D** - TRUNCATE TABLE
10. **C** - WHERE
11. **B** - Exactly one
12. **C** - Dense Index
13. **C** - Secondary Index
14. **C** - Leaf nodes only
15. **C** - Atomicity
16. **D** - Durability
17. **C** - Isolation
18. **C** - Selection (σ)
19. **C** - Projection (π)
20. **B** - M×N
21. **C** - Rectangle/Square
22. **C** - Multivalued Attribute
23. **C** - Cardinality Constraints
24. **A** - Inner Join
25. **B** - M×N rows
26. **D** - FOREIGN KEY
27. **B** - CHECK
28. **C** - COMMIT
29. **C** - Serializable
30. **B** - Growing/Shrinking

---

## STUDY TIPS

1. **Cover answers** - Try to answer before looking
2. **Explain why** - Don't just memorize, understand
3. **Review mistakes** - Focus on questions you got wrong
4. **Use memory tricks** - Connect to the simplified guide
5. **Practice daily** - Repetition helps retention

---

## SCORING

- **27-30 correct** = Excellent! You're ready! 🎯
- **21-26 correct** = Good! Review weak areas 📚
- **15-20 correct** = Keep studying! Focus on basics 📖
- **Below 15** = Review the simplified guide first 🔄

---

**Keep Practicing! Success is in the repetition! 💪**
