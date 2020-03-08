Imports System.ComponentModel

Public Class Form1
    'Week 12 Program: Hotel Occupancy
    'Programmer: Nick DeVos
    'Date: 4/15/2018

    Private Sub btnEnterData_Click(sender As Object, e As EventArgs) Handles btnEnterData.Click
        'Enter Data Button
        Const intTotalFloors As Integer = 8
        Const intTotalRooms As Integer = 240

        Dim intRoomsOccupied As Integer
        Dim intTotalRoomsOccupied As Integer
        Dim dblOccupancyRate As Double
        Dim dblTotalOccupancyRate As Double

        For i = 1 To intTotalFloors

            Dim blnValidInput As Boolean = True
            Dim strRoomsOccupied As String

            Do

                'if input is invalid show message
                If Not blnValidInput Then
                    'Display an error message if the test score is not valid.
                    MessageBox.Show("Rooms occupied must be a postive whole number from 0 and 30.", "Invalid Input")
                End If

                strRoomsOccupied = InputBox("Enter number of rooms occupied for floor " & i.ToString(), "Rooms Occupied")

                blnValidInput = Integer.TryParse(strRoomsOccupied, intRoomsOccupied) And (intRoomsOccupied >= 0 AndAlso intRoomsOccupied <= 30)

                ' if cancel was clicked
                If strRoomsOccupied = String.Empty Then
                    Exit For
                End If

            Loop Until blnValidInput

            dblOccupancyRate = intRoomsOccupied / 30
            lstData.Items.Add("Floor: " & i.ToString() & " Rooms Occupied: " & intRoomsOccupied.ToString() & " Occupancy Rate: " & dblOccupancyRate.ToString("P"))

            intTotalRoomsOccupied += intRoomsOccupied
            lblTotalRoomsOccupied.Text = intTotalRoomsOccupied.ToString()

        Next

        dblTotalOccupancyRate = intTotalRoomsOccupied / intTotalRooms
        lblTotalOccupancyRate.Text = dblTotalOccupancyRate.ToString("P")

    End Sub

    Private Sub btnRestart_Click(sender As Object, e As EventArgs) Handles btnRestart.Click
        'Restart Button
        lstData.Items.Clear()
        lblTotalOccupancyRate.Text = ""
        lblTotalRoomsOccupied.Text = ""
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'Exit Button
        Me.Close()
    End Sub

    Private Sub Form1_Closing(sender As Object, e As CancelEventArgs) Handles Me.Closing
        'Shows programmer's name on Closing event
        MessageBox.Show("Nick DeVos", "Created by")
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles Me.Load
        'For loop used to populate the list of floors on Load event
        For i = 1 To 8
            lstFloor.Items.Add(i)
        Next
    End Sub

End Class
