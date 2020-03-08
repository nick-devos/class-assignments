Imports System.ComponentModel

Public Class Form1
    Private Sub btnCalc_Click(sender As Object, e As EventArgs) Handles btnCalc.Click
        If ErrorProvider1.GetError(txtLabor) = "" Then
            If ErrorProvider1.GetError(txtParts) = "" Then

                If txtLabor.Text IsNot String.Empty Then
                    lblServicesAndLabor.Text = (OilLubeCharges() + FlushCharges() + MiscCharges() + (Convert.ToDouble(txtLabor.Text) * 20)).ToString("c")
                Else
                    lblServicesAndLabor.Text = (OilLubeCharges() + FlushCharges() + MiscCharges()).ToString("c")
                End If

                If txtParts.Text IsNot String.Empty Then
                    lblParts.Text = (Convert.ToDouble(txtParts.Text)).ToString("c")
                Else
                    lblParts.Text = 0.ToString("c")
                End If

                lblTax.Text = TaxCharges().ToString("c")
                lblTotal.Text = TotalCharges().ToString("c")

            End If
        End If
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        ClearOilLube()
        ClearFlushes()
        ClearMisc()
        ClearOther()
        ClearFees()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        Me.Close()
    End Sub

    Private Sub Form1_Closing(sender As Object, e As CancelEventArgs) Handles Me.Closing
        MessageBox.Show("Nick DeVos", "Programmer")
    End Sub

    Function OilLubeCharges() As Double
        Dim dblPrice As Double = 0

        If chkOil.Checked Then
            dblPrice += 26
        End If

        If chkLube.Checked Then
            dblPrice += 18
        End If

        Return dblPrice
    End Function

    Function FlushCharges() As Double
        Dim dblPrice As Double = 0

        If chkRadFlush.Checked Then
            dblPrice += 30
        End If

        If chkTransFlush.Checked Then
            dblPrice += 80
        End If

        Return dblPrice
    End Function

    Function MiscCharges() As Double
        Dim dblPrice As Double = 0

        If chkInspection.Checked Then
            dblPrice += 15
        End If

        If chkMuffler.Checked Then
            dblPrice += 100
        End If

        If chkTireRotate.Checked Then
            dblPrice += 20
        End If

        Return dblPrice
    End Function

    Function OtherCharges() As Double
        Dim dblParts, dblLabor, dblLaborHours, dblPrice As Double

        Try
            dblParts = Convert.ToDouble(txtParts.Text)
            dblPrice += dblParts
        Catch

        End Try

        Try
            dblLaborHours = Convert.ToDouble(txtLabor.Text)
            dblLabor = dblLaborHours * 20
            dblPrice += dblLabor
        Catch

        End Try

        Return dblPrice
    End Function

    Function TaxCharges() As Double
        Dim dblPrice As Double

        If txtParts.Text IsNot String.Empty Then
            dblPrice = Convert.ToDouble(txtParts.Text) * 0.06
        Else
            dblPrice = 0
        End If


        Return dblPrice
    End Function

    Function TotalCharges() As Double
        Dim dblPrice As Double

        dblPrice = OilLubeCharges() + FlushCharges() + MiscCharges() + OtherCharges() + TaxCharges()

        Return dblPrice
    End Function

    Sub ClearOilLube()
        chkOil.Checked = False
        chkLube.Checked = False
    End Sub

    Sub ClearFlushes()
        chkRadFlush.Checked = False
        chkTransFlush.Checked = False
    End Sub

    Sub ClearMisc()
        chkInspection.Checked = False
        chkMuffler.Checked = False
        chkTireRotate.Checked = False
    End Sub

    Sub ClearOther()
        txtParts.Clear()
        txtLabor.Clear()
    End Sub

    Sub ClearFees()
        lblServicesAndLabor.Text = ""
        lblParts.Text = ""
        lblTax.Text = ""
        lblTotal.Text = ""
    End Sub

    Private Sub txtLabor_Validating(sender As Object, e As CancelEventArgs) Handles txtLabor.Validating
        If txtLabor.Text IsNot String.Empty Then
            If IsNumeric(txtLabor.Text) Then
                If Convert.ToDouble(txtLabor.Text) > 0 Then
                    ErrorProvider1.SetError(txtLabor, "")
                Else
                    ErrorProvider1.SetError(txtLabor, "Input must be a positive number!")
                End If
            Else
                ErrorProvider1.SetError(txtLabor, "Input must be a number!")
            End If
        Else
            ErrorProvider1.SetError(txtLabor, "")
        End If
    End Sub

    Private Sub txtParts_Validating(sender As Object, e As CancelEventArgs) Handles txtParts.Validating
        If txtParts.Text IsNot String.Empty Then
            If IsNumeric(txtParts.Text) Then
                If Convert.ToDouble(txtParts.Text) > 0 Then
                    ErrorProvider1.SetError(txtParts, "")
                Else
                    ErrorProvider1.SetError(txtParts, "Input must be a positive number!")
                End If
            Else
                ErrorProvider1.SetError(txtParts, "Input must be a number!")
            End If
        Else
            ErrorProvider1.SetError(txtParts, "")
        End If
    End Sub
End Class
