# furLang
### Datové typy
#### Int: 0-9
Pouze kladná čísla
| Validní | Nevalidní |
|---------|-----------|
| 1       | 01        |
| 0       | 006       |
| 12      |           |
| 200     |           |

#### Binary: b0-1
| Validní | Nevalidní |
|---------|-----------|
| b10     | 101       |
| b01     | B01       |
| b101    | b20       |
|         | b 10      |

#### String: "Znaky kromě dvojité uvozovky"
| Validní        | Nevalidní |
|----------------|-----------|
| "Ahoj"         | 'Ahoj'    |
| "101"          | """       |
| "Ahoj svete"   |           |
| " "            |           |
| "%"            |           |
| "'Ahoj'"       |           |

#### Komentář: #! Znaky kromě vykřičníku a hashe !#
| Validní        | Nevalidní     |
|----------------|---------------|
| #! Poznamka !# | #!Poznamka #! |
| #!Poznamka!#   | #! Poznamka#! |
| #! 101 !#      | !# 12 #!      |
| #!101!#        | #! ! !#       |
| #!!#           |               |
| #! !#          |               |
| #! % !#        |               |

#### Furry: fZvire
| Validní        | Nevalidní     |
|----------------|---------------|
| fPes           | Pes           |
| fKočka         | fkočka        |
| fMýval         | fzmýval       |
| fVlk           |               |
| fLiška         |               |
| fLev           |               |
| fDrak          |               |
| fJelen         |               |
| fKůň           |               |
| fProtogen      |               |

---

### Operace
#### Zadané prvky
#### **+** sčítání

V případě sčítání dvou stringů dojde k jejich konkatenaci

| Vstup            | Výstup        |
|------------------|---------------|
| 2+2              | 4             |
| b01+b101         | b110          |
| "Bota"+"Ponožka" | "BotaPonožka" |
| 2+b01            | *chyba*       |
| b01+2            | *chyba*       |
| "Brambor"+2      | *chyba*       |

#### **\*** násobení

V případě násobení stringu a čísla dojde ke konkatenaci N stringů

| Vstup             | Výstup        |
|-------------------|---------------|
| 2\*2              | 4             |
| b01\*b101         | b101          |
| "Bota"\*"Ponožka" | *chyba*       |
| "Bota"\*2         | "BotaBota"    |
| 2\*b01            | *chyba*       |
| "Brambor"\*b01    | *chyba*       |

#### **(** a **)** začátek a konec závorky

| Vstup             | Výstup        |
|-------------------|---------------|
| (2)               | 2             |
| (2+2)             | 4             |
| (2+3)\*2          | 10            |
| (2\*3)+2          | 8             |
| 2+(2\*3)          | 8             |
| (2\*(2+3))+1      | 11            |

#### Prvek navíc
#### **%** modulo

| Vstup             | Výstup        |
|-------------------|---------------|
| 10%3              | 1             |
| 3%4               | 3             |
| 3%0               | *chyba*       |
| 0%3               | 0             |

---

### Funkce
#### **bindec(bin)**

Převod binárního čísla na desítkové

| Vstup             | Výstup        |
|-------------------|---------------|
| bindec(b101)      | 5             |
| bindec(10)        | *chyba*       |

#### **decbin(dec)**

Převod desítkového čísla na binární

| Vstup             | Výstup        |
|-------------------|---------------|
| decbin(5)         | b101          |
| decbin(b101)      | *chyba*       |

#### **fur(dec)**

Převod desítkového čísla na furry (furryeorva transformace)

| Vstup             | Výstup        |
|-------------------|---------------|
| furry(5)          | fLev          |
| furry(b101)       | *chyba*       |

---

### Priority
- Výrazy v závorkách mají nejvyšší prioritu
- **\*** (násobení) > **+** (sčítání)
- **+** (sčítání) = **%** (modulo)

