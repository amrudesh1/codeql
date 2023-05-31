import java

from Annotation a
where
  a.getType().getName() = "JavascriptNativeInterface"
select a, "This code uses the JavascriptNativeInterface annotation."