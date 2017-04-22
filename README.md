# K-complementary pair finder
algorithm to find K-complementary pairs in a given array of integers. Given Array A, pair (i, j) is K- complementary if K = A[i] + A[j];

# Palindrome finder
algorithm to check if a string is a palindrome. A string is a palindrome if the string matches the reverse of string.
Example: 1221 is a palindrome but not 1121.

# PhraseFinder
Read large file that doesn't fit to memory and find phrases

# MySQL/CAPITALIZE_FIRST.sql
function to capitalize the first letter of a word in a given string;
Example: initcap(UNITED states Of AmERIca ) = United States Of America

# MySQL/SPLIT_COLUMNS.sql
MySQL procedure to split a column into rows using a delimiter.
CREATE TABLE sometbl ( ID INT, NAME VARCHAR(50) );
INSERT INTO sometbl VALUES (1, 'Smith'), (2, 'Julio|Jones|Falcons'), (3, 'White|Snow'), (4, 'Paint|It|Red'), (5, 'Green|Lantern'), (6, 'Brown|bag');
For (2), example rows would look like >> “3, white”, “3, Snow” …
