ALTER TABLE member CHANGE passwd passwd VARCHAR(100) NOT NULL;

DESC member;

SELECT * FROM member;

ALTER TABLE member CHANGE email email VARCHAR(50) NOT NULL;

UPDATE member SET auth_status='Y' WHERE id='kang';

UPDATE member 
SET passwd='4DBF1DD380E2BA81D34E5E0DAC5FFC7C3321E6DFA22AB55798EA8527A329664' 
WHERE id='kimth';

SELECT * FROM board;

ALTER TABLE board CHANGE board_pass board_pass VARCHAR(100) NOT NULL;

UPDATE board 
SET board_pass='3AC674216F3E15C761EE1A5E255F067953623C8B388B4459E13F978D7C846F4';