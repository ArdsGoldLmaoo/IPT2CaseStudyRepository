# IPT2CaseStudyRepository
Repository for case study in IPT2 subject. Geometry equation web service calculator designed for high school students. 

How to run:
1. Open project folder through Netbeans.
2. Right click the project and select clean and build. Wait for Netbeans to finish.
3. Right click the project again and select deploy.
4. Open your browser and type http://localhost:8084/CaseStudyTSM3A/JavaCode to check if the server is running and the code is in xml format.
5. Open SoapUI and click the SOAP button on the upperleft.
6. Paste http://localhost:8084/CaseStudyTSM3A/JavaCode?wsdl in the wsdl field. Name the project.
7. Choose a corresponding equation for the answer needed:
  Guide:
    Mean                - arg0 - Sum of all values.
                        - arg1 - Number of all values.
    *
    Pythagorean Theorem - arg0 - Side of the triangle.
                        - arg1 - The other side of the triangle.
    *
    Area of Triangle    - arg0 - Height of the triangle.
                        - arg1 - Base of the triangle.
    *
    Area of Rectangle   - arg0 - Height of the rectangle.
                        - arg1 - Width of the rectangle.
    *
    Circumference       - arg0 - Radius of the circle
    *
    Area of a Circle    - arg0 - Radius of the circle.
    *
8. Click the green play button at the top left to solve for the equation.
