Imports System.ComponentModel

Public Class Form1
    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'Week 10 Program
        'Programmer: Nick DeVos
        'Date: 4/1/2018
        Try
            Dim dblDistance As Double
            dblDistance = CDbl(txtDistance.Text)

            If radAir.Checked And dblDistance >= 0 Then
                lblSpeedOfSound.Text = (dblDistance / 1100).ToString("n") & " seconds"
            ElseIf radWater.Checked And dblDistance >= 0 Then
                lblSpeedOfSound.Text = (dblDistance / 4900).ToString("n") & " seconds"
            ElseIf radSteel.Checked And dblDistance >= 0 Then
                lblSpeedOfSound.Text = (dblDistance / 16400).ToString("n") & " seconds"
            End If
        Catch ex As Exception

        End Try

    End Sub

    Private Sub Form1_Closing(sender As Object, e As CancelEventArgs) Handles Me.Closing
        MessageBox.Show("Nick DeVos", "Programmer")
    End Sub

    Private Sub txtDistance_Validating(sender As Object, e As CancelEventArgs) Handles txtDistance.Validating
        If Not IsNumeric(txtDistance.Text) Then
            ErrorProvider1.SetError(txtDistance, "Text box must contain a positive number!")
        ElseIf txtDistance.Text < 0 Then
            ErrorProvider1.SetError(txtDistance, "Text box must contain a positive number!")
        Else
            'clear
            ErrorProvider1.SetError(txtDistance, "")
        End If
    End Sub
End Class
