Imports System.ComponentModel

Public Class Form1
    Dim dblBASE_CHARGE As Double = 2000

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        'Week 15 Program - Solar Panel Installation
        'Programmer - Nick DeVos
        'Date - 4/29/2018

        Dim intNumOfPanels As Integer
        Dim dblDepositAmount, dblTotal As Double

        If firstNameValidation(txtFirstName.Text) Then
            If lastNameValidation(txtLastName.Text) Then
                If validPhoneNumber(txtPhone.Text) Then

                    Try
                        intNumOfPanels = Convert.ToInt16(txtPanelAmount.Text)
                        dblDepositAmount = Convert.ToDouble(txtDepositAmount.Text)
                    Catch ex As Exception
                        Return
                    End Try

                    dblTotal = dblBASE_CHARGE + ((intNumOfPanels - 2) * 300)
                    dblTotal += expressCharge(dblTotal)

                    If validateMinimumDeposit(dblDepositAmount, dblTotal) Then
                        lblBaseCharge.Text = (dblBASE_CHARGE).ToString("n")
                        lblAdditionalPanelCharge.Text = ((intNumOfPanels - 2) * 300).ToString("n")
                        lblTotalCost.Text = (dblTotal).ToString("n")
                        lblDepositAmount.Text = (dblDepositAmount).ToString("n")
                        lblBalanceDue.Text = (dblTotal - dblDepositAmount).ToString("n")

                        If dblDepositAmount > dblTotal Then
                            lblBalance.Text = "Refund Amount:"
                            lblBalanceDue.Text = (dblDepositAmount - dblTotal).ToString("n")
                        End If

                        displayCharges()
                    Else
                        gbCharges.Visible() = False
                        MessageBox.Show("Deposit entered does not meet minimum of 40% total cost!", "Larger deposit needed")
                    End If
                Else
                        MessageBox.Show("Phone number not valid", "Invalid entry")
                End If
            Else
                MessageBox.Show("Last name not entered", "Blank textbox")
            End If
        Else
            MessageBox.Show("First name not entered", "Blank textbox")
        End If
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        txtFirstName.Clear()
        txtLastName.Clear()
        txtPhone.Clear()
        txtPanelAmount.Clear()
        txtDepositAmount.Clear()
        If chkExpressInstall.Checked Then
            chkExpressInstall.Select()
        End If
        gbCharges.Visible() = False
        txtFirstName.Focus()
    End Sub

    Private Sub btnClose_Click(sender As Object, e As EventArgs) Handles btnClose.Click
        Me.Close()
    End Sub

    Private Sub Form1_Closing(sender As Object, e As CancelEventArgs) Handles Me.Closing
        MessageBox.Show("Nick DeVos", "Programmer")
    End Sub

    Private Sub txtFirstName_Validation(sender As Object, e As CancelEventArgs) Handles txtFirstName.Validating, txtDepositAmount.Validating, txtLastName.Validating, txtPanelAmount.Validating, txtPhone.Validating
        For Each c As Control In Me.Controls 'loops through controls on form
            If TypeOf c Is GroupBox Then 'if control is a groupbox (since each textbox is in a groupbox)
                For Each ce As Control In c.Controls 'for each control in each groupbox
                    If ce.GetType Is GetType(TextBox) Then 'if the control is a textbox check the input, this prevents ErrorProvider from showing on labels
                        If sender.Text = String.Empty Then 'blank textbox
                            ErrorProvider1.SetError(sender, "Textbox must not be blank!")
                        Else
                            ErrorProvider1.SetError(sender, "") 'clear errorprovider
                        End If 'no textboxes outside of groupbox or additional code would be needed
                    End If
                Next
            End If
        Next
    End Sub

    Private Sub txtPanelAmount_Validating(sender As Object, e As CancelEventArgs) Handles txtPanelAmount.Validating
        Dim intPanels As Integer
        Dim booPanelAmtError As Boolean = False

        Try
            intPanels = Convert.ToInt16(txtPanelAmount.Text)
            booPanelAmtError = False
        Catch ex As Exception
            ErrorProvider1.SetError(txtPanelAmount, "Must be an integer!")
            booPanelAmtError = True
        End Try

        If Not booPanelAmtError Then

            If Convert.ToInt16(txtPanelAmount.Text) < 2 Then
                ErrorProvider1.SetError(txtPanelAmount, "You must buy at least two panels")
            Else
                ErrorProvider1.SetError(txtPanelAmount, "")
            End If

        End If
    End Sub

    Function firstNameValidation(ByVal firstName As String) As Boolean
        If firstName IsNot String.Empty Then
            Return True
        Else
            Return False
        End If
    End Function

    Function lastNameValidation(ByVal lastName As String) As Boolean
        If lastName IsNot String.Empty Then
            Return True
        Else
            Return False
        End If
    End Function

    Function validPhoneNumber(ByVal phoneNum As String) As Boolean

        phoneNum = phoneNum.Replace("-", "") 'remove any hyphens if present
        If phoneNum.Length() = 10 Then 'must be 10 digits
            Return True
        Else
            Return False
        End If
    End Function

    Function expressCharge(ByVal totalCost As Double) As Double
        Dim dblExpressCharge As Double = 0

        If chkExpressInstall.Checked Then
            dblExpressCharge = totalCost * 0.05
        End If

        Return dblExpressCharge
    End Function

    Function minimumDeposit(ByVal totalCost As Double) As Double
        Dim dblMinDeposit As Double

        dblMinDeposit = totalCost * 0.4

        Return dblMinDeposit
    End Function

    Function validateMinimumDeposit(ByVal depositEntered As Double, ByVal totalCost As Double) As Boolean
        If depositEntered >= minimumDeposit(totalCost) Then
            Return True
        Else
            Return False
        End If

    End Function

    Sub displayCharges()
        gbCharges.Visible() = True
    End Sub

    Private Sub txtDepositAmount_Validating(sender As Object, e As CancelEventArgs) Handles txtDepositAmount.Validating
        Dim booError As Boolean = False
        Dim dblTotal As Double

        Try
            dblTotal = (Convert.ToDouble(txtPanelAmount.Text) - 2) * 300 + dblBASE_CHARGE
            If chkExpressInstall.Checked Then
                dblTotal = dblTotal + (dblTotal * 0.05)
            End If
            booError = (Convert.ToDouble(txtDepositAmount)) < (0.4 * (dblTotal))
        Catch ex As Exception

        End Try

        If booError Then
            ErrorProvider1.SetError(txtDepositAmount, "Deposit not large enough")
        Else
            ErrorProvider1.SetError(txtDepositAmount, "")
        End If
    End Sub

End Class
