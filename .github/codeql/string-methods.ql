import java

from MethodAccess ma
where
  ma.getMethod().getName() in ["contains", "endsWith", "startsWith"]
select ma, "This code calls a potentially dangerous method."