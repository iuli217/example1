cd C:\Users\iulian.dumitru\eclipse-workspace\testM
set ProjectPath=C:\Users\iulian.dumitru\eclipse-workspace\testM
echo %ProjectPath%
set classpath=%ProjectPath%\bin;%ProjectPath%\lib\*
echo %classpath%
java org.testng.TestNG %ProjectPath%\testngConfig.xml