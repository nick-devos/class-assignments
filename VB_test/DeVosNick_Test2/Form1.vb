Imports System.Drawing.Printing

Public Class Form1
    'DeVos_Test2
    'Programmer: Nick DeVos
    'Date: 2/19/2018
    Dim memoryImage As Bitmap

    Private Sub CaptureScreen()
        Dim myGraphics As Graphics = Me.CreateGraphics()
        Dim s As Size = Me.Size
        memoryImage = New Bitmap(s.Width, s.Height, myGraphics)
        Dim memoryGraphics As Graphics = Graphics.FromImage(memoryImage)
        memoryGraphics.CopyFromScreen(Me.Location.X, Me.Location.Y, 0, 0, s)
    End Sub

    Private Sub PrintDocument1_PrintPage(sender As Object, e As PrintPageEventArgs) Handles PrintDocument1.PrintPage
        e.Graphics.DrawImage(memoryImage, 0, 0)
    End Sub

    Private Sub Form1_Load(sender As Object, e As EventArgs) Handles Me.Load
        'display date when form is loaded
        lblDate.Text = Today.ToString()
    End Sub

    Private Sub btnPrint_Click(sender As Object, e As EventArgs) Handles btnPrint.Click
        'when print button is clicked
        CaptureScreen()
        PrintDocument1.Print()
    End Sub

    Private Sub btnCalculate_Click(sender As Object, e As EventArgs) Handles btnCalculate.Click
        Dim totalPrice, price, discount, orderTotal As Double
        Dim quantity As Integer

        price = Convert.ToInt16(txtPrice.Text)
        quantity = Convert.ToInt16(txtQuantity.Text)
        'total price = quantity * price
        totalPrice = price * quantity
        lblTotalPrice.Text = totalPrice.ToString("C")
        'lblDiscount = .15 * total price
        discount = 0.15 * totalPrice
        lblDiscount.Text = discount.ToString("C")
        'order total = total price - discount
        orderTotal = totalPrice - discount
        lblFinalPrice.Text = orderTotal.ToString("C")

        'display GroupBox2
        GroupBox2.Visible() = True
    End Sub

    Private Sub btnClear_Click(sender As Object, e As EventArgs) Handles btnClear.Click
        'clear all fields and reset user at beginning
        txtPrice.Clear()
        txtQuantity.Clear()
        txtTitle.Clear()
        lblDiscount.Text = ""
        lblFinalPrice.Text = ""
        lblTotalPrice.Text = ""

        txtQuantity.Focus()
    End Sub

    Private Sub btnExit_Click(sender As Object, e As EventArgs) Handles btnExit.Click
        'show message and close
        MessageBox.Show("Nick DeVos")
        Me.Close()
    End Sub
End Class
