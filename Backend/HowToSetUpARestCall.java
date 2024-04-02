How to Implement the REST Call

        1. Create the backend DTO:     If you called it FormArrayDTO on the frontend, then call it FormArrayDTO on the backend
        If you called it DetailDTO on the frontend,    then call it DetailDTO on the backend

        2. Create the backend service:     ReportService
        -- Add a public method that only has a logger

        3. Create the backend controller:  ReportController
        Inject the service into the controller
        -- Use the service

        4. Test it using Postman
        -- Is all of the passed-in data getting through?

        5. Figure out the SQL

        6. Change the backend service to actually run your SQL

        7. Test it using Postman



