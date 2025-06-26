@echo off
setlocal
set ERROR_CODE=0
set SCRIPT_DIR=%~dp0
set MVNW_PATH=%SCRIPT_DIR%mvnw
bash "%MVNW_PATH%" %*
if errorlevel 1 set ERROR_CODE=1
exit /b %ERROR_CODE%