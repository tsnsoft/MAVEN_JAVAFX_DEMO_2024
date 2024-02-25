echo off
set MODULE=kz.tsnsoft.maven_javafx_demo
set PACKAGE=%MODULE%
set CLASS=App
@start /b java -m %MODULE%/%PACKAGE%.%CLASS%
