/**
 * @kind problem
 * @id java/sec-concerns
 */


import java

from StringLiteral sl
where
  sl.getValue() = "ECB"
select sl, "This code contains the string 'ECB'."
