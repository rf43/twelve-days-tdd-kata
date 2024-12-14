# twelve-days-tdd-kata
A friend of mine posted this TDD kata the other day and I thought it was interesting. I thought it would be neat to do this in a few different languages (maybe lol)

The original instructions can be found at [Samman Technical Coaching: Twelve Days of Christmas Song](https://sammancoaching.org/kata_descriptions/christmas_song.html)

## Twelve Days of Christmas Song

I've looked around and seen some different takes on this kata which bring up some things to think about when deciding on what this project might look like...

Do we want to be able to simply output the song lyrics in their entirety?

Do we want to be able to output each stanza given a day?

For example, given day `5` the output would be:
```
On the fifth day of Christmas
My true love sent to me:
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
```

I think for this TDD kata we should provide both!

### Acceptance Criteria

- Output the full lyrics of the carol "The Twelve Days of Christmas". 
- Given a day, output the correct stanza of the carol "The Twelve Days of Christmas"
- The words must be reproduced in the correct order. 
- The case, format, and punctuation should be suitable for a carol singer to use, similar to the lyrics example below.
- Each line in a stanza should be a separate line
- The output must not have newlines at the beginning or end of the carol
- The output of the full carol must have an empty line in-between each stanza
- The output must not have newlines at the beginning or end of a stanza
- Must use Test Driven Development (TDD)
  - In other words, **must** include tests
- Use the language standard library as much as possible (i.e. minimize the use of third-party libs as much as possible) 
- Do not include the entire text of the lyrics or read a file which contains them

#### Notes

This is not meant to be the _smallest_ code (eg. code golf) but focused more of what potential production-level, tested code might look like
  - Production-level code means readable, testable, and easily modifiable (easily refactored) code which may not necessarily be the most "clever" or smallest/compact code

### Lyrics

The lyrics are as follows:

```
On the first day of Christmas
My true love sent to me:
A partridge in a pear tree.

On the second day of Christmas
My true love sent to me:
Two turtle doves and
A partridge in a pear tree.

On the third day of Christmas
My true love sent to me:
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the fourth day of Christmas
My true love sent to me:
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the fifth day of Christmas
My true love sent to me:
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the sixth day of Christmas,
My true love sent to me:
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the seventh day of Christmas,
My true love sent to me:
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the eighth day of Christmas,
My true love sent to me:
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the ninth day of Christmas,
My true love sent to me:
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the tenth day of Christmas,
My true love sent to me:
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the eleventh day of Christmas,
My true love sent to me:
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.

On the twelfth day of Christmas,
My true love sent to me:
Twelve drummers drumming
Eleven pipers piping
Ten lords a-leaping
Nine ladies dancing
Eight maids a-milking
Seven swans a-swimming
Six geese a-laying
Five golden rings
Four calling birds
Three french hens
Two turtle doves and
A partridge in a pear tree.
```

# Acknowledgments

[Samman Technical Coaching](https://sammancoaching.org/)

This kata is described on [Cyber-Dojo](https://cyber-dojo.org/) and comes originally from [Rosetta Code](https://rosettacode.org/).
