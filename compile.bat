@REM @echo off
@REM echo Running Java...

@REM @REM if exit App.class (
@REM @REM     del App.class
@REM @REM ) 

@REM javac App.java

@REM if %ERRORLEVEL% NEQ 0 (
@REM     echo Compile failed!
@REM     pause
@REM     exit /b
@REM )

@REM java App
@REM pause

@echo off
echo Running Java...

:: ساخت پوشه bin اگر نبود
if not exist bin mkdir bin

javac -d bin -sourcepath src src\*.java

:: اسم کلاس اصلی رو اینجا بنویس (مثلاً Main)
java -cp bin App

pause