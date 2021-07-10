/*

Phone book data Structure

<-------------------->

<>Big Considerations<>
- inserting / deleting - have to avoid collisions
- searching

<>Structure<>

  I immediately wanted to avoid any kind of binary structure like a tree because there countChildren
be multiples of the same last name (even though the directions stated that they would be unique). Since
we search a phone book based on last name and not based on number, we need a way to use ASCII codes
to search names, which leads me to think that a hash table is the best way to go for the larger structure.
Because there will likely be multiple people with the same last name, we will need to chain this initial
hash table with something else that stores the first names. I again ran into the issue of collisions when
thinking about what to use next. If I used a binary tree, then the first names would have to be unique so
as to allow for a binary search, which is likely going to happen. Then I considered the primary use of a
phone book: to search up some ones number NOT to add or remove some one's number. So because of this, each
object would have to have its own unique place, and I think an Array list would help with this. The Array list
is dynamic and can be expanded, but also it can searched quickly using a binary search method. I don't want to
use a linked list for the chained seconary structure because I want to be able to perform a binary search.

<>Structure<>
- Last names stored in a hash table
- First names and phone numbers stored in a chained array list

<>Search<>
- will perform a binary search using the ASCII codes of last names and first names

*/
