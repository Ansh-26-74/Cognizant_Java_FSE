BEGIN
    FOR loan_record IN (
        SELECT c.Name, l.LoanID, l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan '
            || loan_record.LoanID
            || ' for '
            || loan_record.Name
            || ' is due on '
            || TO_CHAR(loan_record.DueDate, 'DD-MON-YYYY')
        );
    END LOOP;
END;
/