@echo OFF
color 17

echo.
echo.
echo.
echo    Hi 
echo.
echo    Do You Want to start Installation of python [y/n]:
set /p ch=

if "%ch%"=="n" (
echo.
echo.
echo.
echo    Exit Installation Process User Abort !!!.
echo.
pause
exit
)


if "%ch%"=="N" (
echo.
echo.
echo.
echo    Exit Installation Process User Abort !!!.
echo.
pause
exit
)

echo.
echo    Starting Installation Process !!!
echo.


python --version 2>NUL

if errorlevel 1 goto errorNoPython
:: Reaching here means Python is installed.
echo.
echo    Python Already Installed 
echo.
Pause
goto:eof

:errorNoPython
:: Reaching here means Python is not installed.
:: Execute stuff to install Anaconda3 ...
echo Error^: Python not installed
pause
start /d "." Anaconda3.EXE 
echo.
echo    Anaconda3 Installation Stated
echo.
pause
echo   Anaconda3 Completed Installation
pause
exit
