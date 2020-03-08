Imports System.ComponentModel

Public Class Form1

    Dim bolTooManyCommas As Boolean

    Private Sub btnRemove_Click(sender As Object, e As EventArgs) Handles btnRemove.Click
        'Week 11 Program
        'Programmer: Nick DeVos
        'Date: 4/1/2018

        Dim strNumWithCommas As String
        Dim strNumArr() As String
        Dim strNewNum As String = ""

        strNumWithCommas = txtNumber.Text
        strNumArr = strNumWithCommas.Split(",") 'splits the number at the commas

        For count = 0 To strNumArr.Length - 1 'puts the seperated numbers back together
            strNewNum += strNumArr(count)
        Next

        If strNumArr.Length <= 4 Then 'four sections of numbers divided by no more than 3 commas
            lblNoCommaNum.Text = strNewNum.ToString
        Else
            ErrorProvider1.SetError(txtNumber, "Maximum of 3 commas allowed!")
        End If

    End Sub

    Private Sub Form1_Closing(sender As Object, e As CancelEventArgs) Handles Me.Closing
        MessageBox.Show("Nick DeVos", "Programmer")
    End Sub

    Private Sub txtNumber_Validating(sender As Object, e As CancelEventArgs) Handles txtNumber.Validating
        If txtNumber.Text = "" Then
            ErrorProvider1.SetError(txtNumber, "You must enter some number!")
        Else
            ErrorProvider1.SetError(txtNumber, "")
        End If
    End Sub
End Class
