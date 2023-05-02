package day10_PracticeTasks;

public class StatusCode {

    public static void main(String[] args) {

        int status_code = 404;

        String result = (status_code == 200)? "OK" :(status_code == 201)? "Created" :(status_code == 202)? "Accepted"
                :(status_code == 301)? "Moved Permanently" :(status_code == 303)? "See Other" :(status_code == 304)? "Not Modified"
                :(status_code == 307)? "Temporary Redirect" :(status_code == 400)? "Bad Request" :(status_code == 401)? "Unauthorized"
                :(status_code == 403)? "Forbidden" :(status_code == 404)? "Not Found" :(status_code == 410)? "Gone"
                :(status_code == 500)? "Internal Server Error" :(status_code == 503)? "Service Unavailable" : "Invalid code";
        System.out.println(result);

    }

}

/*
HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a valid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.
 */
