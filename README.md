# Viva 1 : Flow Control — WIX1002: FOP  
**Semester 1 2025/26**

---

## 🧾 INSTRUCTIONS

1. Complete all questions in your designated project group.  
2. All members must contribute to writing the codes.  
   - (i.e. 1 question = 1 person)  
   - Share the workload if there’s an additional question relative to the actual number of members in your team (i.e. 5).  
   - Ensure that all members must understand and explain codes from any of the questions.  
3. During viva, all students in each team will be randomly asked to describe, answer, and edit any of the answers provided. Marks will be given to your ability to present the answers.

---

## 📘 Lab Report

Prepare a report to solve the problems below. The report should contain all the following sections for **each question**:

| Section | Description |
|----------|--------------|
| 1 | Problem Description |
| 2 | Solution Explanation |
| 3 | Sample Input & Output |
| 4 | Source Code (Java) |

### Requirements
1. Group Assignment (same grouping as project group)  
2. Cover page with all student matric numbers and full names  
3. Font: *Times New Roman 12*, Line Spacing: *1.5*  
4. Submit to Spectrum according to your OCC.  
   - **Deadline:** Before your viva session (Week 6)

---

## ❓ Question 1: The Tok Wan's Number Charms and the Pasar Malam Challenge

### 🧩 Problem Statement
In Cheras, Tok Wan creates number “charms” using:
- **Initial Value (a)**  
- **Multiplier Seed (b)**  
- **Charm Length (n)**  

For each query, calculate a sequence where each step adds `b × 2^i` to the initial value.

#### Example:
If `a = 1, b = 4, n = 4`

| Step | Formula | Result |
|------|----------|---------|
| 0 | 1 + 4×2⁰ | 5 |
| 1 | 1 + 4×2¹ | 9 |
| 2 | 1 + 4×2² | 17 |
| 3 | 1 + 4×2³ | 33 |

Output: `5 9 17 33`

#### Input Example
```
2
0 2 10
5 3 5
```

#### Output Example
```
2 4 8 16 32 64 128 256 512 1024
8 11 17 29 53
```

#### Tips
- `q ≤ 500`
- `a, b ≤ 50`
- `1 ≤ n ≤ 15`

---

## ❓ Question 2: Ah Hock's Digital Signature

### 🧩 Problem Statement
Ah Hock analyzes numbers with a **Lucky Digit (L)** to find the **Digital Signature**.

#### Digit Categories:
1. **Lucky Digits:** match L  
2. **Zeroes:** digit 0 (if not L)  
3. **Even Digits:** 2, 4, 6, 8  
4. **Odd Digits:** 1, 3, 5, 7, 9  

#### Signature Rules
- `LUCKY` → Lucky count > all others  
- `BALANCED` → Even count > all others  
- `ENERGETIC` → Odd count > all others  
- `NEUTRAL` → Otherwise (ties or zero highest)

#### Example:
`N = 881307, L = 8`  
→ Lucky = 2, Zero = 1, Even = 0, Odd = 3  
→ **ENERGETIC**

#### Input
```
4
881307 8
2213 5
1110 1
8888 8
```

#### Output
```
ENERGETIC
NEUTRAL
LUCKY
LUCKY
```

#### Tips
- `1 ≤ T ≤ 200`
- `0 ≤ N ≤ 2,000,000,000`
- `0 ≤ L ≤ 9`

---

## ❓ Question 3: Puan Norah's Digital Kolam

### 🧩 Problem Statement
Generate patterns based on:
- **Height (H)**
- **Style (S)**: `'A'` (Angled) or `'P'` (Pyramid)

#### Style A (Angled)
```
H = 5
1
22
333
4444
55555
```

#### Style P (Pyramid)
Centered palindromic pyramid.

Example `H=4`:
```
   1
  121
 12321
1234321
```

#### Input
```
3
4 P
5 A
3 P
```

#### Output
```
   1
  121
 12321
1234321
1
22
333
4444
55555
  1
 121
12321
```

#### Tips
- `1 ≤ T ≤ 50`
- `1 ≤ H ≤ 9`
- `S ∈ {A, P}`

---

## ❓ Question 4: The Tale of Tok Wan Osman — Word Gems and Hidden Values

### 🧩 Problem Statement
Given a word and integer `k`, find:

1. **First Whisper** → lexicographically smallest substring of length k  
2. **Last Echo** → lexicographically largest substring of length k  
3. **Core Value** → substring with the highest ASCII sum  

Example:
```
satayisverysedap
3
```

#### Result
```
ata     (First Whisper)
rys     (Core Value)
yse     (Last Echo)
```

#### Tips
- Input: 1 word (letters only) + integer k  
- Convert uppercase to lowercase automatically  
- Word ≤ 50 characters  

---

## ❓ Question 5: Uncle Lim's Golden Harmony Lanterns

### 🧩 Problem Statement
A word follows **Golden Harmony** if:
1. It does **not end with a vowel**  
2. No **two vowels** are adjacent  

Vowels: `a, e, i, o, u`

#### Example:
- `meriah` → ❌ *Chaos* (adjacent vowels i–a)  
- `syukur` → ✅ *Harmony*

#### Input
```
4
syukur
meriah
gembira
suka
```

#### Output
```
Harmony
Chaos
Chaos
Chaos
```

#### Tips
- `1 ≤ T ≤ 100`
- Lowercase English letters only  
- Word length ≤ 50  

---

## ❓ Question 6: Alex's Stutter Decompression

### 🧩 Problem Statement
Compressed “stutter” format:
- Letters = append directly  
- Digits (2–9) = repeat previous letter `(digit-1)` more times  

### ❌ Invalid Conditions
- First char is a digit  
- Digit follows another digit  
- Contains `0` or `1`

If valid → output decompressed **length**  
If invalid → output `"Invalid Log"`

#### Example 1: Valid
```
a4b2
```
→ `a → aaaa → aaaab → aaaabb`  
→ Output: `6`

#### Example 2: Invalid
```
ha33t
```
→ Second 3 follows another digit → Invalid Log

#### Input
```
5
a4b2
log5
4bidden
test1ng
xy22z
```

#### Output
```
6
7
Invalid Log
Invalid Log
Invalid Log
```

#### Tips
- `1 ≤ T ≤ 100`
- Only lowercase letters + digits (0–9)
- Compressed string ≤ 50 chars  
- Decompressed ≤ 200 chars  

---
